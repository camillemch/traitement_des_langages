// $ANTLR null /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g 2020-01-05 23:54:28

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class NiklausParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDOP", "AFFECT", "COMMENT", 
		"COMPOP", "ELSE", "ID", "IF", "INT", "MULTOP", "PROGRAM", "READ", "VAR", 
		"WHILE", "WRITE", "WS", "'('", "')'", "','", "';'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int ADDOP=4;
	public static final int AFFECT=5;
	public static final int COMMENT=6;
	public static final int COMPOP=7;
	public static final int ELSE=8;
	public static final int ID=9;
	public static final int IF=10;
	public static final int INT=11;
	public static final int MULTOP=12;
	public static final int PROGRAM=13;
	public static final int READ=14;
	public static final int VAR=15;
	public static final int WHILE=16;
	public static final int WRITE=17;
	public static final int WS=18;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public NiklausParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public NiklausParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return NiklausParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g"; }


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:7:1: expr : term ( ADDOP ^ term )* ;
	public final NiklausParser.expr_return expr() throws RecognitionException {
		NiklausParser.expr_return retval = new NiklausParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ADDOP2=null;
		ParserRuleReturnScope term1 =null;
		ParserRuleReturnScope term3 =null;

		Object ADDOP2_tree=null;

		try {
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:7:7: ( term ( ADDOP ^ term )* )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:7:9: term ( ADDOP ^ term )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_term_in_expr26);
			term1=term();
			state._fsp--;

			adaptor.addChild(root_0, term1.getTree());

			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:7:14: ( ADDOP ^ term )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ADDOP) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:7:15: ADDOP ^ term
					{
					ADDOP2=(Token)match(input,ADDOP,FOLLOW_ADDOP_in_expr29); 
					ADDOP2_tree = (Object)adaptor.create(ADDOP2);
					root_0 = (Object)adaptor.becomeRoot(ADDOP2_tree, root_0);

					pushFollow(FOLLOW_term_in_expr32);
					term3=term();
					state._fsp--;

					adaptor.addChild(root_0, term3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:9:1: term : factor ( MULTOP ^ factor )* ;
	public final NiklausParser.term_return term() throws RecognitionException {
		NiklausParser.term_return retval = new NiklausParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULTOP5=null;
		ParserRuleReturnScope factor4 =null;
		ParserRuleReturnScope factor6 =null;

		Object MULTOP5_tree=null;

		try {
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:9:7: ( factor ( MULTOP ^ factor )* )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:9:9: factor ( MULTOP ^ factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_term43);
			factor4=factor();
			state._fsp--;

			adaptor.addChild(root_0, factor4.getTree());

			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:9:16: ( MULTOP ^ factor )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==MULTOP) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:9:17: MULTOP ^ factor
					{
					MULTOP5=(Token)match(input,MULTOP,FOLLOW_MULTOP_in_term46); 
					MULTOP5_tree = (Object)adaptor.create(MULTOP5);
					root_0 = (Object)adaptor.becomeRoot(MULTOP5_tree, root_0);

					pushFollow(FOLLOW_factor_in_term49);
					factor6=factor();
					state._fsp--;

					adaptor.addChild(root_0, factor6.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:11:1: factor : ( ID | INT | ( '(' ! expr ')' !) );
	public final NiklausParser.factor_return factor() throws RecognitionException {
		NiklausParser.factor_return retval = new NiklausParser.factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID7=null;
		Token INT8=null;
		Token char_literal9=null;
		Token char_literal11=null;
		ParserRuleReturnScope expr10 =null;

		Object ID7_tree=null;
		Object INT8_tree=null;
		Object char_literal9_tree=null;
		Object char_literal11_tree=null;

		try {
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:11:9: ( ID | INT | ( '(' ! expr ')' !) )
			int alt3=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt3=1;
				}
				break;
			case INT:
				{
				alt3=2;
				}
				break;
			case 19:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:11:11: ID
					{
					root_0 = (Object)adaptor.nil();


					ID7=(Token)match(input,ID,FOLLOW_ID_in_factor60); 
					ID7_tree = (Object)adaptor.create(ID7);
					adaptor.addChild(root_0, ID7_tree);

					}
					break;
				case 2 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:11:16: INT
					{
					root_0 = (Object)adaptor.nil();


					INT8=(Token)match(input,INT,FOLLOW_INT_in_factor64); 
					INT8_tree = (Object)adaptor.create(INT8);
					adaptor.addChild(root_0, INT8_tree);

					}
					break;
				case 3 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:11:22: ( '(' ! expr ')' !)
					{
					root_0 = (Object)adaptor.nil();


					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:11:22: ( '(' ! expr ')' !)
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:11:24: '(' ! expr ')' !
					{
					char_literal9=(Token)match(input,19,FOLLOW_19_in_factor70); 
					pushFollow(FOLLOW_expr_in_factor73);
					expr10=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr10.getTree());

					char_literal11=(Token)match(input,20,FOLLOW_20_in_factor75); 
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class comparaison_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparaison"
	// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:13:1: comparaison : expr COMPOP ^ expr ;
	public final NiklausParser.comparaison_return comparaison() throws RecognitionException {
		NiklausParser.comparaison_return retval = new NiklausParser.comparaison_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMPOP13=null;
		ParserRuleReturnScope expr12 =null;
		ParserRuleReturnScope expr14 =null;

		Object COMPOP13_tree=null;

		try {
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:13:14: ( expr COMPOP ^ expr )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:13:17: expr COMPOP ^ expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_in_comparaison88);
			expr12=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr12.getTree());

			COMPOP13=(Token)match(input,COMPOP,FOLLOW_COMPOP_in_comparaison90); 
			COMPOP13_tree = (Object)adaptor.create(COMPOP13);
			root_0 = (Object)adaptor.becomeRoot(COMPOP13_tree, root_0);

			pushFollow(FOLLOW_expr_in_comparaison93);
			expr14=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr14.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparaison"


	public static class read_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "read"
	// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:15:1: read : READ ^ ID ';' !;
	public final NiklausParser.read_return read() throws RecognitionException {
		NiklausParser.read_return retval = new NiklausParser.read_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ15=null;
		Token ID16=null;
		Token char_literal17=null;

		Object READ15_tree=null;
		Object ID16_tree=null;
		Object char_literal17_tree=null;

		try {
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:15:7: ( READ ^ ID ';' !)
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:15:10: READ ^ ID ';' !
			{
			root_0 = (Object)adaptor.nil();


			READ15=(Token)match(input,READ,FOLLOW_READ_in_read103); 
			READ15_tree = (Object)adaptor.create(READ15);
			root_0 = (Object)adaptor.becomeRoot(READ15_tree, root_0);

			ID16=(Token)match(input,ID,FOLLOW_ID_in_read106); 
			ID16_tree = (Object)adaptor.create(ID16);
			adaptor.addChild(root_0, ID16_tree);

			char_literal17=(Token)match(input,22,FOLLOW_22_in_read108); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "read"


	public static class write_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "write"
	// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:17:1: write : WRITE ^ expr ';' !;
	public final NiklausParser.write_return write() throws RecognitionException {
		NiklausParser.write_return retval = new NiklausParser.write_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WRITE18=null;
		Token char_literal20=null;
		ParserRuleReturnScope expr19 =null;

		Object WRITE18_tree=null;
		Object char_literal20_tree=null;

		try {
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:17:8: ( WRITE ^ expr ';' !)
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:17:10: WRITE ^ expr ';' !
			{
			root_0 = (Object)adaptor.nil();


			WRITE18=(Token)match(input,WRITE,FOLLOW_WRITE_in_write119); 
			WRITE18_tree = (Object)adaptor.create(WRITE18);
			root_0 = (Object)adaptor.becomeRoot(WRITE18_tree, root_0);

			pushFollow(FOLLOW_expr_in_write122);
			expr19=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr19.getTree());

			char_literal20=(Token)match(input,22,FOLLOW_22_in_write124); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "write"


	public static class affectation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "affectation"
	// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:19:1: affectation : ID AFFECT ^ expr ';' !;
	public final NiklausParser.affectation_return affectation() throws RecognitionException {
		NiklausParser.affectation_return retval = new NiklausParser.affectation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID21=null;
		Token AFFECT22=null;
		Token char_literal24=null;
		ParserRuleReturnScope expr23 =null;

		Object ID21_tree=null;
		Object AFFECT22_tree=null;
		Object char_literal24_tree=null;

		try {
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:19:13: ( ID AFFECT ^ expr ';' !)
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:19:15: ID AFFECT ^ expr ';' !
			{
			root_0 = (Object)adaptor.nil();


			ID21=(Token)match(input,ID,FOLLOW_ID_in_affectation133); 
			ID21_tree = (Object)adaptor.create(ID21);
			adaptor.addChild(root_0, ID21_tree);

			AFFECT22=(Token)match(input,AFFECT,FOLLOW_AFFECT_in_affectation135); 
			AFFECT22_tree = (Object)adaptor.create(AFFECT22);
			root_0 = (Object)adaptor.becomeRoot(AFFECT22_tree, root_0);

			pushFollow(FOLLOW_expr_in_affectation138);
			expr23=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr23.getTree());

			char_literal24=(Token)match(input,22,FOLLOW_22_in_affectation140); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "affectation"


	public static class loop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "loop"
	// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:21:1: loop : WHILE ^ '(' ! comparaison ')' ! '{' ! instruction '}' !;
	public final NiklausParser.loop_return loop() throws RecognitionException {
		NiklausParser.loop_return retval = new NiklausParser.loop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE25=null;
		Token char_literal26=null;
		Token char_literal28=null;
		Token char_literal29=null;
		Token char_literal31=null;
		ParserRuleReturnScope comparaison27 =null;
		ParserRuleReturnScope instruction30 =null;

		Object WHILE25_tree=null;
		Object char_literal26_tree=null;
		Object char_literal28_tree=null;
		Object char_literal29_tree=null;
		Object char_literal31_tree=null;

		try {
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:21:7: ( WHILE ^ '(' ! comparaison ')' ! '{' ! instruction '}' !)
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:21:9: WHILE ^ '(' ! comparaison ')' ! '{' ! instruction '}' !
			{
			root_0 = (Object)adaptor.nil();


			WHILE25=(Token)match(input,WHILE,FOLLOW_WHILE_in_loop150); 
			WHILE25_tree = (Object)adaptor.create(WHILE25);
			root_0 = (Object)adaptor.becomeRoot(WHILE25_tree, root_0);

			char_literal26=(Token)match(input,19,FOLLOW_19_in_loop153); 
			pushFollow(FOLLOW_comparaison_in_loop156);
			comparaison27=comparaison();
			state._fsp--;

			adaptor.addChild(root_0, comparaison27.getTree());

			char_literal28=(Token)match(input,20,FOLLOW_20_in_loop158); 
			char_literal29=(Token)match(input,23,FOLLOW_23_in_loop161); 
			pushFollow(FOLLOW_instruction_in_loop164);
			instruction30=instruction();
			state._fsp--;

			adaptor.addChild(root_0, instruction30.getTree());

			char_literal31=(Token)match(input,24,FOLLOW_24_in_loop166); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "loop"


	public static class condition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condition"
	// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:23:1: condition : IF ^ '(' ! comparaison ')' ! '{' ! instruction '}' ! ELSE '{' ! instruction '}' !;
	public final NiklausParser.condition_return condition() throws RecognitionException {
		NiklausParser.condition_return retval = new NiklausParser.condition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF32=null;
		Token char_literal33=null;
		Token char_literal35=null;
		Token char_literal36=null;
		Token char_literal38=null;
		Token ELSE39=null;
		Token char_literal40=null;
		Token char_literal42=null;
		ParserRuleReturnScope comparaison34 =null;
		ParserRuleReturnScope instruction37 =null;
		ParserRuleReturnScope instruction41 =null;

		Object IF32_tree=null;
		Object char_literal33_tree=null;
		Object char_literal35_tree=null;
		Object char_literal36_tree=null;
		Object char_literal38_tree=null;
		Object ELSE39_tree=null;
		Object char_literal40_tree=null;
		Object char_literal42_tree=null;

		try {
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:23:11: ( IF ^ '(' ! comparaison ')' ! '{' ! instruction '}' ! ELSE '{' ! instruction '}' !)
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:23:13: IF ^ '(' ! comparaison ')' ! '{' ! instruction '}' ! ELSE '{' ! instruction '}' !
			{
			root_0 = (Object)adaptor.nil();


			IF32=(Token)match(input,IF,FOLLOW_IF_in_condition175); 
			IF32_tree = (Object)adaptor.create(IF32);
			root_0 = (Object)adaptor.becomeRoot(IF32_tree, root_0);

			char_literal33=(Token)match(input,19,FOLLOW_19_in_condition178); 
			pushFollow(FOLLOW_comparaison_in_condition181);
			comparaison34=comparaison();
			state._fsp--;

			adaptor.addChild(root_0, comparaison34.getTree());

			char_literal35=(Token)match(input,20,FOLLOW_20_in_condition183); 
			char_literal36=(Token)match(input,23,FOLLOW_23_in_condition186); 
			pushFollow(FOLLOW_instruction_in_condition189);
			instruction37=instruction();
			state._fsp--;

			adaptor.addChild(root_0, instruction37.getTree());

			char_literal38=(Token)match(input,24,FOLLOW_24_in_condition191); 
			ELSE39=(Token)match(input,ELSE,FOLLOW_ELSE_in_condition194); 
			ELSE39_tree = (Object)adaptor.create(ELSE39);
			adaptor.addChild(root_0, ELSE39_tree);

			char_literal40=(Token)match(input,23,FOLLOW_23_in_condition196); 
			pushFollow(FOLLOW_instruction_in_condition199);
			instruction41=instruction();
			state._fsp--;

			adaptor.addChild(root_0, instruction41.getTree());

			char_literal42=(Token)match(input,24,FOLLOW_24_in_condition201); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condition"


	public static class instruction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instruction"
	// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:25:1: instruction : ( comparaison | read | write | affectation | loop | condition )* ;
	public final NiklausParser.instruction_return instruction() throws RecognitionException {
		NiklausParser.instruction_return retval = new NiklausParser.instruction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope comparaison43 =null;
		ParserRuleReturnScope read44 =null;
		ParserRuleReturnScope write45 =null;
		ParserRuleReturnScope affectation46 =null;
		ParserRuleReturnScope loop47 =null;
		ParserRuleReturnScope condition48 =null;


		try {
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:25:13: ( ( comparaison | read | write | affectation | loop | condition )* )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:25:15: ( comparaison | read | write | affectation | loop | condition )*
			{
			root_0 = (Object)adaptor.nil();


			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:25:15: ( comparaison | read | write | affectation | loop | condition )*
			loop4:
			while (true) {
				int alt4=7;
				switch ( input.LA(1) ) {
				case ID:
					{
					int LA4_2 = input.LA(2);
					if ( (LA4_2==AFFECT) ) {
						alt4=4;
					}
					else if ( (LA4_2==ADDOP||LA4_2==COMPOP||LA4_2==MULTOP) ) {
						alt4=1;
					}

					}
					break;
				case INT:
				case 19:
					{
					alt4=1;
					}
					break;
				case READ:
					{
					alt4=2;
					}
					break;
				case WRITE:
					{
					alt4=3;
					}
					break;
				case WHILE:
					{
					alt4=5;
					}
					break;
				case IF:
					{
					alt4=6;
					}
					break;
				}
				switch (alt4) {
				case 1 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:25:16: comparaison
					{
					pushFollow(FOLLOW_comparaison_in_instruction211);
					comparaison43=comparaison();
					state._fsp--;

					adaptor.addChild(root_0, comparaison43.getTree());

					}
					break;
				case 2 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:25:30: read
					{
					pushFollow(FOLLOW_read_in_instruction215);
					read44=read();
					state._fsp--;

					adaptor.addChild(root_0, read44.getTree());

					}
					break;
				case 3 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:25:37: write
					{
					pushFollow(FOLLOW_write_in_instruction219);
					write45=write();
					state._fsp--;

					adaptor.addChild(root_0, write45.getTree());

					}
					break;
				case 4 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:25:45: affectation
					{
					pushFollow(FOLLOW_affectation_in_instruction222);
					affectation46=affectation();
					state._fsp--;

					adaptor.addChild(root_0, affectation46.getTree());

					}
					break;
				case 5 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:25:59: loop
					{
					pushFollow(FOLLOW_loop_in_instruction226);
					loop47=loop();
					state._fsp--;

					adaptor.addChild(root_0, loop47.getTree());

					}
					break;
				case 6 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:25:66: condition
					{
					pushFollow(FOLLOW_condition_in_instruction230);
					condition48=condition();
					state._fsp--;

					adaptor.addChild(root_0, condition48.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruction"


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:27:1: program : PROGRAM ^ ID ';' ! ( declaration )? '{' ! instruction '}' !;
	public final NiklausParser.program_return program() throws RecognitionException {
		NiklausParser.program_return retval = new NiklausParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PROGRAM49=null;
		Token ID50=null;
		Token char_literal51=null;
		Token char_literal53=null;
		Token char_literal55=null;
		ParserRuleReturnScope declaration52 =null;
		ParserRuleReturnScope instruction54 =null;

		Object PROGRAM49_tree=null;
		Object ID50_tree=null;
		Object char_literal51_tree=null;
		Object char_literal53_tree=null;
		Object char_literal55_tree=null;

		try {
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:27:10: ( PROGRAM ^ ID ';' ! ( declaration )? '{' ! instruction '}' !)
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:27:12: PROGRAM ^ ID ';' ! ( declaration )? '{' ! instruction '}' !
			{
			root_0 = (Object)adaptor.nil();


			PROGRAM49=(Token)match(input,PROGRAM,FOLLOW_PROGRAM_in_program242); 
			PROGRAM49_tree = (Object)adaptor.create(PROGRAM49);
			root_0 = (Object)adaptor.becomeRoot(PROGRAM49_tree, root_0);

			ID50=(Token)match(input,ID,FOLLOW_ID_in_program245); 
			ID50_tree = (Object)adaptor.create(ID50);
			adaptor.addChild(root_0, ID50_tree);

			char_literal51=(Token)match(input,22,FOLLOW_22_in_program247); 
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:27:30: ( declaration )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==VAR) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:27:30: declaration
					{
					pushFollow(FOLLOW_declaration_in_program251);
					declaration52=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration52.getTree());

					}
					break;

			}

			char_literal53=(Token)match(input,23,FOLLOW_23_in_program255); 
			pushFollow(FOLLOW_instruction_in_program258);
			instruction54=instruction();
			state._fsp--;

			adaptor.addChild(root_0, instruction54.getTree());

			char_literal55=(Token)match(input,24,FOLLOW_24_in_program260); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:29:1: declaration : VAR ^ ( ID ',' !)* ID ';' !;
	public final NiklausParser.declaration_return declaration() throws RecognitionException {
		NiklausParser.declaration_return retval = new NiklausParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR56=null;
		Token ID57=null;
		Token char_literal58=null;
		Token ID59=null;
		Token char_literal60=null;

		Object VAR56_tree=null;
		Object ID57_tree=null;
		Object char_literal58_tree=null;
		Object ID59_tree=null;
		Object char_literal60_tree=null;

		try {
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:29:13: ( VAR ^ ( ID ',' !)* ID ';' !)
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:29:15: VAR ^ ( ID ',' !)* ID ';' !
			{
			root_0 = (Object)adaptor.nil();


			VAR56=(Token)match(input,VAR,FOLLOW_VAR_in_declaration271); 
			VAR56_tree = (Object)adaptor.create(VAR56);
			root_0 = (Object)adaptor.becomeRoot(VAR56_tree, root_0);

			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:29:20: ( ID ',' !)*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ID) ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1==21) ) {
						alt6=1;
					}

				}

				switch (alt6) {
				case 1 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:29:22: ID ',' !
					{
					ID57=(Token)match(input,ID,FOLLOW_ID_in_declaration276); 
					ID57_tree = (Object)adaptor.create(ID57);
					adaptor.addChild(root_0, ID57_tree);

					char_literal58=(Token)match(input,21,FOLLOW_21_in_declaration278); 
					}
					break;

				default :
					break loop6;
				}
			}

			ID59=(Token)match(input,ID,FOLLOW_ID_in_declaration284); 
			ID59_tree = (Object)adaptor.create(ID59);
			adaptor.addChild(root_0, ID59_tree);

			char_literal60=(Token)match(input,22,FOLLOW_22_in_declaration286); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"

	// Delegated rules



	public static final BitSet FOLLOW_term_in_expr26 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDOP_in_expr29 = new BitSet(new long[]{0x0000000000080A00L});
	public static final BitSet FOLLOW_term_in_expr32 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_factor_in_term43 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_MULTOP_in_term46 = new BitSet(new long[]{0x0000000000080A00L});
	public static final BitSet FOLLOW_factor_in_term49 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_ID_in_factor60 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_factor64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_factor70 = new BitSet(new long[]{0x0000000000080A00L});
	public static final BitSet FOLLOW_expr_in_factor73 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_factor75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_comparaison88 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COMPOP_in_comparaison90 = new BitSet(new long[]{0x0000000000080A00L});
	public static final BitSet FOLLOW_expr_in_comparaison93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read103 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_read106 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_read108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WRITE_in_write119 = new BitSet(new long[]{0x0000000000080A00L});
	public static final BitSet FOLLOW_expr_in_write122 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_write124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_affectation133 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AFFECT_in_affectation135 = new BitSet(new long[]{0x0000000000080A00L});
	public static final BitSet FOLLOW_expr_in_affectation138 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_affectation140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_loop150 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_loop153 = new BitSet(new long[]{0x0000000000080A00L});
	public static final BitSet FOLLOW_comparaison_in_loop156 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_loop158 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_loop161 = new BitSet(new long[]{0x00000000010B4E00L});
	public static final BitSet FOLLOW_instruction_in_loop164 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_loop166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_condition175 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_condition178 = new BitSet(new long[]{0x0000000000080A00L});
	public static final BitSet FOLLOW_comparaison_in_condition181 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_condition183 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_condition186 = new BitSet(new long[]{0x00000000010B4E00L});
	public static final BitSet FOLLOW_instruction_in_condition189 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_condition191 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ELSE_in_condition194 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_condition196 = new BitSet(new long[]{0x00000000010B4E00L});
	public static final BitSet FOLLOW_instruction_in_condition199 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_condition201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparaison_in_instruction211 = new BitSet(new long[]{0x00000000000B4E02L});
	public static final BitSet FOLLOW_read_in_instruction215 = new BitSet(new long[]{0x00000000000B4E02L});
	public static final BitSet FOLLOW_write_in_instruction219 = new BitSet(new long[]{0x00000000000B4E02L});
	public static final BitSet FOLLOW_affectation_in_instruction222 = new BitSet(new long[]{0x00000000000B4E02L});
	public static final BitSet FOLLOW_loop_in_instruction226 = new BitSet(new long[]{0x00000000000B4E02L});
	public static final BitSet FOLLOW_condition_in_instruction230 = new BitSet(new long[]{0x00000000000B4E02L});
	public static final BitSet FOLLOW_PROGRAM_in_program242 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_program245 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_program247 = new BitSet(new long[]{0x0000000000808000L});
	public static final BitSet FOLLOW_declaration_in_program251 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_program255 = new BitSet(new long[]{0x00000000010B4E00L});
	public static final BitSet FOLLOW_instruction_in_program258 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_program260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_declaration271 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_declaration276 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_declaration278 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_declaration284 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_declaration286 = new BitSet(new long[]{0x0000000000000002L});
}
