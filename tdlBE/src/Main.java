import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

  
public class Main {

	static String file_name = "pgcd";
	static String root_niklaus = "../../ProgrammesNiklaus/";
	static String root_arm = "../../ProgrammesARM/";
	static List<String> variables =  new ArrayList<String>();
	static List<String> var_delete =  new ArrayList<String>();
	static int i = 0;
	static int i_if = 0;
	static int i_while=0;
	static String derniere_adresse= "";
	
	public static void main(String[] a) throws IOException, RecognitionException, ExceptionVariables {
		// création d'un objet lexeur
		NiklausLexer lexer = new NiklausLexer(new ANTLRFileStream(root_niklaus + file_name + ".niklaus"));
		// création d'un objet parseur
		NiklausParser parser = new NiklausParser(new CommonTokenStream(lexer));
		// obtention de l'AST
		NiklausParser.program_return r = parser.program();
		Tree t = (Tree)r.getTree();
		 
		//Process tree
		String content = "mov r6, #initialisation_pile \n";
		
		//write
		for (int i = 1; i < t.getChildCount(); i++ ) {
			Tree ssArbre = t.getChild(i);
			content = process_block(ssArbre, content);
		}
		content += derniere_adresse+"\n";
		//Remove variables
		var_delete = removeDuplicates(var_delete);
		for (String element : var_delete) {
			content += "@mem_"+element+" rmw 1\n";
		}
		// Add library
		content = add_library(root_arm, content);
		
		content += "@initialisation_pile rmw 1";
		// Write arm file
		write_arm_file(root_arm, file_name, content);
		
	}
	private static String process_block(Tree arbre, String content) throws ExceptionVariables {
		switch(arbre.getType()) {
		case NiklausLexer.VAR:
			for (int i = 0; i < arbre.getChildCount(); i++ ) {
				if (!variables.contains(arbre.getChild(i).getText())) {
				variables.add(arbre.getChild(i).getText());
				}
				else {
					throw new ExceptionVariables("La variable " +arbre.getChild(i).getText()+ " a déjà été déclarée");
				}
			}
			break;
		case NiklausLexer.AFFECT:
			String id = arbre.getChild(0).getText();
			if (!variables.contains(id)) {
				throw new ExceptionVariables("La variable "+ id +" n'est pas déclarée");
			}
			Tree expr = arbre.getChild(1);
			content = process_expr(expr, content);
			content += "str r0, mem_"+id+"\n";
			var_delete.add(id);
			break;
		case NiklausLexer.WRITE:
			Tree expr1 = arbre.getChild(0);
			content += 	"mov r7, #print_"+i+"\n";
			content = process_expr(expr1, content);
			content += 	"b printInt\n" +
						"@print_"+i+"\n";
			derniere_adresse = "b print_"+i;
			i++;
			break;
		case NiklausLexer.READ:
			String id1 = arbre.getChild(0).getText();
			content += 	"mov r7, #read_"+i+"\n"+
						"b readInt\n" +
						"@read_"+i+"\n"+
						"str r0, mem_"+id1+"\n";
			var_delete.add(id1);
			derniere_adresse = "b read_"+i;
			i++;
			break;
		case NiklausLexer.IF:
			String[] blocs = get_bloc(arbre);
			content = process_if(arbre, blocs, content);
			break;
		case NiklausLexer.WHILE:
			content = process_while(arbre, content);
			break;
		default:
			System.out.println("Lexeme non reconnu");
		   // erreur, lexème non pris en charge !
		}
		return content;
	}
	
	private static String process_expr(Tree arbre, String content) throws ExceptionVariables {
		switch(arbre.getType()) {
		case NiklausLexer.INT:
			content += "mov r0, #"+arbre.getText()+"\n";
			break;
		case NiklausLexer.ID:
			if (variables.contains(arbre.getText())) {
				content += "ldr r0, mem_"+arbre.getText()+"\n";
			}else {
				throw new ExceptionVariables("Variable "+arbre.getText()+" non déclarée");
			}
			break;
		case NiklausLexer.ADDOP:
			content = process_expr(arbre.getChild(0), content);
			content += "push r0 \n";
			content = process_expr(arbre.getChild(1), content);
			content += "pop r1 \n";
			if (arbre.getText().equals("+")) {
				content += "add r0, r1, r0 \n";
			}
			else if (arbre.getText().equals("-")) {
				content += "sub r0, r1, r0 \n";
			}
			else if (arbre.getText().equals("mod")) {
				content += 	"str r1, 0xAAAA\n" + 
							"str r0, 0xAAAB\n" + 
							"ldr r0, 0xAAAE\n";
			}
			break;
		case NiklausLexer.MULTOP:
			content = process_expr(arbre.getChild(0), content);
			content += "push r0 \n";
			content = process_expr(arbre.getChild(1), content);
			content += "pop r1 \n";
			content += 	"str r1, 0xAAAA\n" + "str r0, 0xAAAB\n";
			if (arbre.getText().equals("*")) {
				content += 	"ldr r0, 0xAAAC\n";
			}
			else if (arbre.getText().equals("/")) {
				content += 	"ldr r0, 0xAAAD\n";
			}
			break;
		}
		return content;
	}
	
	private static String[] get_bloc(Tree arbre) throws ExceptionVariables {
		int index_else = 1;
		String bloc1 = "";
		String bloc2 = "";
		while (arbre.getChild(index_else).getType() != NiklausLexer.ELSE) {
			index_else++;
		}
		for (int i = 1; i < index_else; i++ ) {
			bloc1 = process_block(arbre.getChild(i), bloc1);
		}
		for (int i = index_else+1; i < arbre.getChildCount(); i++ ) {
			bloc2 = process_block(arbre.getChild(i), bloc2);
		}
		return new String[] {bloc1, bloc2};
	}
	
	private static String process_comp(Tree gauche, Tree droite, String content) throws ExceptionVariables {
		content = process_expr(gauche, content);
		content += "push r0 \n";
		content = process_expr(droite, content);
		content += "pop r1 \n"
				+ "cmp r1, r0\n";
		return content;
	}
	
	private static String process_if(Tree arbre, String[] blocs, String content) throws ExceptionVariables {
		if (arbre.getChild(0).getText().equals("=")) {
			content = process_comp(arbre.getChild(0).getChild(0),arbre.getChild(0).getChild(1), content);
			content += "beq si_vrai_"+i_if+" \n" +
						blocs[1] +
						"b fin_test_"+i_if+"\n" +
						"@si_vrai_"+i_if+" \n"+
						blocs[0] +
						"mov r0, #0\n"+
						"@fin_test_"+i_if+" \n" ;
			derniere_adresse = "b fin_test_"+i_if;
			i_if++;
		}else if (arbre.getChild(0).getText().equals("<>")){
			content = process_comp(arbre.getChild(0).getChild(0),arbre.getChild(0).getChild(1), content);
			content += "beq si_vrai_"+i_if+" \n" +
					blocs[0]  +
					"b fin_test_"+i_if+"\n" +
					"@si_vrai_"+i_if+" \n"+
					blocs[1]  +
					"mov r0, #0\n"+
					"@fin_test_"+i_if+" \n" ;
			derniere_adresse = "b fin_test_"+i_if;
			i_if++;
		}else if (arbre.getChild(0).getText().equals("<")){
			content = process_comp(arbre.getChild(0).getChild(0),arbre.getChild(0).getChild(1), content);
			content += "blt si_vrai_"+i_if+" \n" +
					blocs[1]  +
					"b fin_test_"+i_if+"\n" +
					"@si_vrai_"+i_if+" \n"+
					blocs[0]  +
					"mov r0, #0\n"+
					"@fin_test_"+i_if+" \n" ;
			derniere_adresse = "b fin_test_"+i_if;
			i_if++;
		}else if (arbre.getChild(0).getText().equals(">")){
			content = process_comp(arbre.getChild(0).getChild(1),arbre.getChild(0).getChild(0), content);
			content += "blt si_vrai_"+i_if+" \n" +
					blocs[1]  +
					"b fin_test_"+i_if+"\n" +
					"@si_vrai_"+i_if+" \n"+
					blocs[0] +
					"mov r0, #0\n"+
					"@fin_test_"+i_if+" \n" ;
			derniere_adresse = "b fin_test_"+i_if;
			i_if++;
		}else if (arbre.getChild(0).getText().equals("<=")){
			content = process_comp(arbre.getChild(0).getChild(1),arbre.getChild(0).getChild(0), content);
			content += "blt si_vrai_"+i_if+" \n" +
					blocs[0] +
					"b fin_test_"+i_if+"\n" +
					"@si_vrai_"+i_if+" \n"+
					blocs[1] +
					"mov r0, #0\n"+
					"@fin_test_"+i_if+" \n" ;
			derniere_adresse = "b fin_test_"+i_if;
			i_if++;
		}else if (arbre.getChild(0).getText().equals(">=")){
			content = process_comp(arbre.getChild(0).getChild(0),arbre.getChild(0).getChild(1), content);
			content += "blt si_vrai_"+i_if+" \n" +
					blocs[0] +
					"b fin_test_"+i_if+"\n" +
					"@si_vrai_"+i_if+" \n"+
					blocs[1] +
					"mov r0, #0\n"+
					"@fin_test_"+i_if+" \n" ;
			derniere_adresse = "b fin_test_"+i_if;
			i_if++;
		}
		return content;
	}
	
	private static String process_while(Tree arbre, String content) throws ExceptionVariables {
		if (arbre.getChild(0).getText().equals("=")) {
			content += "@boucle_debut_"+ i_while + "\n";
			content = process_comp(arbre.getChild(0).getChild(0),arbre.getChild(0).getChild(1), content);
			content += "beq si_vrai_"+i_while+" \n" +
						"b fin_boucle_"+i_while+"\n" +
						"@si_vrai_"+i_while+" \n";
			for (int i = 1; i < arbre.getChildCount(); i++ ) {
				content = process_block(arbre.getChild(i), content);
			}
			content += "b boucle_debut_"+ i_while + "\n"+
						"@fin_boucle_"+i_while+" \n" ;
			derniere_adresse = "b fin_boucle_"+i_while;
			i_while++;
		}else if (arbre.getChild(0).getText().equals("<>")){
			content += "@boucle_debut_"+ i_while + "\n";
			content = process_comp(arbre.getChild(0).getChild(0),arbre.getChild(0).getChild(1), content);
			content += "beq fin_boucle_"+i_while+" \n";
			for (int i = 1; i < arbre.getChildCount(); i++ ) {
				content = process_block(arbre.getChild(i), content);
			}
			content += "b boucle_debut_"+ i_while + "\n"+
						"@fin_boucle_"+i_while+" \n" ;
			derniere_adresse = "b fin_boucle_"+i_while;
			i_while++;
		}else if (arbre.getChild(0).getText().equals(">=")){
			content += "@boucle_debut_"+ i_while + "\n";
			content = process_comp(arbre.getChild(0).getChild(0),arbre.getChild(0).getChild(1), content);
			content += "blt fin_boucle_"+i_while+"\n";
			for (int i = 1; i < arbre.getChildCount(); i++ ) {
				content = process_block(arbre.getChild(i), content);
			}
			content += "b boucle_debut_"+ i_while + "\n"+
						"@fin_boucle_"+i_while+" \n" ;
			derniere_adresse = "b fin_boucle_"+i_while;
			i_while++;
		}else if (arbre.getChild(0).getText().equals("<=")){
			content += "@boucle_debut_"+ i_while + "\n";
			content = process_comp(arbre.getChild(0).getChild(1),arbre.getChild(0).getChild(0), content);
			content += "blt fin_boucle_"+i_while+"\n";
			for (int i = 1; i < arbre.getChildCount(); i++ ) {
				content = process_block(arbre.getChild(i), content);
			}
			content += "b boucle_debut_"+ i_while + "\n"+
						"@fin_boucle_"+i_while+" \n" ;
			derniere_adresse = "b fin_boucle_"+i_while;
			i_while++;
		}else if (arbre.getChild(0).getText().equals("<")){
			content += "@boucle_debut_"+ i_while + "\n";
			content = process_comp(arbre.getChild(0).getChild(0),arbre.getChild(0).getChild(1), content);
			content += "blt si_vrai_"+i_while+" \n" +
						"b fin_boucle_"+i_while+"\n" +
						"@si_vrai_"+i_while+" \n";
			for (int i = 1; i < arbre.getChildCount(); i++ ) {
				content = process_block(arbre.getChild(i), content);
			}
			content += "b boucle_debut_"+ i_while + "\n"+
						"@fin_boucle_"+i_while+" \n" ;
			derniere_adresse = "b fin_boucle_"+i_while;
			i_while++;
		}else if (arbre.getChild(0).getText().equals(">")){
			content += "@boucle_debut_"+ i_while + "\n";
			content = process_comp(arbre.getChild(0).getChild(1),arbre.getChild(0).getChild(0), content);
			content += "blt si_vrai_"+i_while+" \n" +
						"b fin_boucle_"+i_while+"\n" +
						"@si_vrai_"+i_while+" \n";
			for (int i = 1; i < arbre.getChildCount(); i++ ) {
				content = process_block(arbre.getChild(i), content);
			}
			content += "b boucle_debut_"+ i_while + "\n"+
						"@fin_boucle_"+i_while+" \n" ;
			derniere_adresse = "b fin_boucle_"+i_while;
			i_while++;
		}
		return content;
	}
	private static void write_arm_file(String root_arm, String file_name, String content) {
		BufferedWriter bw = null;
		try {
			File f = new File(root_arm + file_name + ".arm");
			if (!f.exists()) {
				f.createNewFile();
			}
			FileWriter fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			bw.write(content);
		} catch (IOException io) {
			io.printStackTrace();
		} finally { 
			try {
				if(bw!=null)
					bw.close();
			} catch(Exception ex) {
				System.out.println("Error in closing the BufferedWriter"+ex);
			}
		}
	}
	
	private static String add_library(String root_arm, String content) throws IOException {
		FileReader fr = new FileReader(root_arm + "lib.arm");
		BufferedReader br = new BufferedReader(fr);

		String s = br.readLine();
		while(s != null) {
			content += s + '\n';
			s = br.readLine();
		}
		br.close();
		return content;
	}
	
	public static List<String> removeDuplicates(List<String> list) 
    { 
        List<String> newList = new ArrayList<String>(); 
        for (String element : list) { 
            if (!newList.contains(element)) { 
            		newList.add(element); 
            } 
        } 
        return newList; 
    } 
}
