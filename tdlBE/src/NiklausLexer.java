// $ANTLR null /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g 2020-01-05 23:54:28

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class NiklausLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public NiklausLexer() {} 
	public NiklausLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public NiklausLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g"; }

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:2:7: ( '(' )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:3:7: ( ')' )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:4:7: ( ',' )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:4:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:5:7: ( ';' )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:5:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:6:7: ( '{' )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:6:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:7:7: ( '}' )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:7:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:31:5: ( ( '0' .. '9' )+ )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:31:7: ( '0' .. '9' )+
			{
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:31:7: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:35:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:35:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:35:14: (~ ( '\\n' | '\\r' ) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:35:28: ( '\\r' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\r') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:35:28: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:38:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:38:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ADDOP"
	public final void mADDOP() throws RecognitionException {
		try {
			int _type = ADDOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:45:7: ( '+' | '-' | 'mod' )
			int alt4=3;
			switch ( input.LA(1) ) {
			case '+':
				{
				alt4=1;
				}
				break;
			case '-':
				{
				alt4=2;
				}
				break;
			case 'm':
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:45:9: '+'
					{
					match('+'); 
					}
					break;
				case 2 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:45:15: '-'
					{
					match('-'); 
					}
					break;
				case 3 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:45:21: 'mod'
					{
					match("mod"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDOP"

	// $ANTLR start "MULTOP"
	public final void mMULTOP() throws RecognitionException {
		try {
			int _type = MULTOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:47:8: ( '*' | '/' )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:
			{
			if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTOP"

	// $ANTLR start "COMPOP"
	public final void mCOMPOP() throws RecognitionException {
		try {
			int _type = COMPOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:49:8: ( '<' | '<=' | '=' | '<>' | '>=' | '>' )
			int alt5=6;
			switch ( input.LA(1) ) {
			case '<':
				{
				switch ( input.LA(2) ) {
				case '=':
					{
					alt5=2;
					}
					break;
				case '>':
					{
					alt5=4;
					}
					break;
				default:
					alt5=1;
				}
				}
				break;
			case '=':
				{
				alt5=3;
				}
				break;
			case '>':
				{
				int LA5_3 = input.LA(2);
				if ( (LA5_3=='=') ) {
					alt5=5;
				}

				else {
					alt5=6;
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:49:10: '<'
					{
					match('<'); 
					}
					break;
				case 2 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:49:16: '<='
					{
					match("<="); 

					}
					break;
				case 3 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:49:23: '='
					{
					match('='); 
					}
					break;
				case 4 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:49:29: '<>'
					{
					match("<>"); 

					}
					break;
				case 5 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:49:36: '>='
					{
					match(">="); 

					}
					break;
				case 6 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:49:43: '>'
					{
					match('>'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPOP"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:51:6: ( 'read' )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:51:8: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "WRITE"
	public final void mWRITE() throws RecognitionException {
		try {
			int _type = WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:53:7: ( 'write' )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:53:9: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WRITE"

	// $ANTLR start "AFFECT"
	public final void mAFFECT() throws RecognitionException {
		try {
			int _type = AFFECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:55:8: ( ':=' )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:55:10: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AFFECT"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:57:7: ( 'while' )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:57:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:59:4: ( 'if' )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:59:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:61:6: ( 'else' )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:61:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "PROGRAM"
	public final void mPROGRAM() throws RecognitionException {
		try {
			int _type = PROGRAM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:63:9: ( 'program' )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:63:11: 'program'
			{
			match("program"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROGRAM"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:65:5: ( 'var' )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:65:7: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:67:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:67:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:67:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | INT | COMMENT | WS | ADDOP | MULTOP | COMPOP | READ | WRITE | AFFECT | WHILE | IF | ELSE | PROGRAM | VAR | ID )
		int alt7=21;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt7=1;
			}
			break;
		case ')':
			{
			alt7=2;
			}
			break;
		case ',':
			{
			alt7=3;
			}
			break;
		case ';':
			{
			alt7=4;
			}
			break;
		case '{':
			{
			alt7=5;
			}
			break;
		case '}':
			{
			alt7=6;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt7=7;
			}
			break;
		case '/':
			{
			int LA7_8 = input.LA(2);
			if ( (LA7_8=='/') ) {
				alt7=8;
			}

			else {
				alt7=11;
			}

			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt7=9;
			}
			break;
		case '+':
		case '-':
			{
			alt7=10;
			}
			break;
		case 'm':
			{
			int LA7_11 = input.LA(2);
			if ( (LA7_11=='o') ) {
				int LA7_23 = input.LA(3);
				if ( (LA7_23=='d') ) {
					int LA7_31 = input.LA(4);
					if ( ((LA7_31 >= '0' && LA7_31 <= '9')||(LA7_31 >= 'A' && LA7_31 <= 'Z')||LA7_31=='_'||(LA7_31 >= 'a' && LA7_31 <= 'z')) ) {
						alt7=21;
					}

					else {
						alt7=10;
					}

				}

				else {
					alt7=21;
				}

			}

			else {
				alt7=21;
			}

			}
			break;
		case '*':
			{
			alt7=11;
			}
			break;
		case '<':
		case '=':
		case '>':
			{
			alt7=12;
			}
			break;
		case 'r':
			{
			int LA7_14 = input.LA(2);
			if ( (LA7_14=='e') ) {
				int LA7_24 = input.LA(3);
				if ( (LA7_24=='a') ) {
					int LA7_32 = input.LA(4);
					if ( (LA7_32=='d') ) {
						int LA7_39 = input.LA(5);
						if ( ((LA7_39 >= '0' && LA7_39 <= '9')||(LA7_39 >= 'A' && LA7_39 <= 'Z')||LA7_39=='_'||(LA7_39 >= 'a' && LA7_39 <= 'z')) ) {
							alt7=21;
						}

						else {
							alt7=13;
						}

					}

					else {
						alt7=21;
					}

				}

				else {
					alt7=21;
				}

			}

			else {
				alt7=21;
			}

			}
			break;
		case 'w':
			{
			switch ( input.LA(2) ) {
			case 'r':
				{
				int LA7_25 = input.LA(3);
				if ( (LA7_25=='i') ) {
					int LA7_33 = input.LA(4);
					if ( (LA7_33=='t') ) {
						int LA7_40 = input.LA(5);
						if ( (LA7_40=='e') ) {
							int LA7_46 = input.LA(6);
							if ( ((LA7_46 >= '0' && LA7_46 <= '9')||(LA7_46 >= 'A' && LA7_46 <= 'Z')||LA7_46=='_'||(LA7_46 >= 'a' && LA7_46 <= 'z')) ) {
								alt7=21;
							}

							else {
								alt7=14;
							}

						}

						else {
							alt7=21;
						}

					}

					else {
						alt7=21;
					}

				}

				else {
					alt7=21;
				}

				}
				break;
			case 'h':
				{
				int LA7_26 = input.LA(3);
				if ( (LA7_26=='i') ) {
					int LA7_34 = input.LA(4);
					if ( (LA7_34=='l') ) {
						int LA7_41 = input.LA(5);
						if ( (LA7_41=='e') ) {
							int LA7_47 = input.LA(6);
							if ( ((LA7_47 >= '0' && LA7_47 <= '9')||(LA7_47 >= 'A' && LA7_47 <= 'Z')||LA7_47=='_'||(LA7_47 >= 'a' && LA7_47 <= 'z')) ) {
								alt7=21;
							}

							else {
								alt7=16;
							}

						}

						else {
							alt7=21;
						}

					}

					else {
						alt7=21;
					}

				}

				else {
					alt7=21;
				}

				}
				break;
			default:
				alt7=21;
			}
			}
			break;
		case ':':
			{
			alt7=15;
			}
			break;
		case 'i':
			{
			int LA7_17 = input.LA(2);
			if ( (LA7_17=='f') ) {
				int LA7_27 = input.LA(3);
				if ( ((LA7_27 >= '0' && LA7_27 <= '9')||(LA7_27 >= 'A' && LA7_27 <= 'Z')||LA7_27=='_'||(LA7_27 >= 'a' && LA7_27 <= 'z')) ) {
					alt7=21;
				}

				else {
					alt7=17;
				}

			}

			else {
				alt7=21;
			}

			}
			break;
		case 'e':
			{
			int LA7_18 = input.LA(2);
			if ( (LA7_18=='l') ) {
				int LA7_28 = input.LA(3);
				if ( (LA7_28=='s') ) {
					int LA7_36 = input.LA(4);
					if ( (LA7_36=='e') ) {
						int LA7_42 = input.LA(5);
						if ( ((LA7_42 >= '0' && LA7_42 <= '9')||(LA7_42 >= 'A' && LA7_42 <= 'Z')||LA7_42=='_'||(LA7_42 >= 'a' && LA7_42 <= 'z')) ) {
							alt7=21;
						}

						else {
							alt7=18;
						}

					}

					else {
						alt7=21;
					}

				}

				else {
					alt7=21;
				}

			}

			else {
				alt7=21;
			}

			}
			break;
		case 'p':
			{
			int LA7_19 = input.LA(2);
			if ( (LA7_19=='r') ) {
				int LA7_29 = input.LA(3);
				if ( (LA7_29=='o') ) {
					int LA7_37 = input.LA(4);
					if ( (LA7_37=='g') ) {
						int LA7_43 = input.LA(5);
						if ( (LA7_43=='r') ) {
							int LA7_49 = input.LA(6);
							if ( (LA7_49=='a') ) {
								int LA7_52 = input.LA(7);
								if ( (LA7_52=='m') ) {
									int LA7_53 = input.LA(8);
									if ( ((LA7_53 >= '0' && LA7_53 <= '9')||(LA7_53 >= 'A' && LA7_53 <= 'Z')||LA7_53=='_'||(LA7_53 >= 'a' && LA7_53 <= 'z')) ) {
										alt7=21;
									}

									else {
										alt7=19;
									}

								}

								else {
									alt7=21;
								}

							}

							else {
								alt7=21;
							}

						}

						else {
							alt7=21;
						}

					}

					else {
						alt7=21;
					}

				}

				else {
					alt7=21;
				}

			}

			else {
				alt7=21;
			}

			}
			break;
		case 'v':
			{
			int LA7_20 = input.LA(2);
			if ( (LA7_20=='a') ) {
				int LA7_30 = input.LA(3);
				if ( (LA7_30=='r') ) {
					int LA7_38 = input.LA(4);
					if ( ((LA7_38 >= '0' && LA7_38 <= '9')||(LA7_38 >= 'A' && LA7_38 <= 'Z')||LA7_38=='_'||(LA7_38 >= 'a' && LA7_38 <= 'z')) ) {
						alt7=21;
					}

					else {
						alt7=20;
					}

				}

				else {
					alt7=21;
				}

			}

			else {
				alt7=21;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'n':
		case 'o':
		case 'q':
		case 's':
		case 't':
		case 'u':
		case 'x':
		case 'y':
		case 'z':
			{
			alt7=21;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 7, 0, input);
			throw nvae;
		}
		switch (alt7) {
			case 1 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:10: T__19
				{
				mT__19(); 

				}
				break;
			case 2 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:16: T__20
				{
				mT__20(); 

				}
				break;
			case 3 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:22: T__21
				{
				mT__21(); 

				}
				break;
			case 4 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:28: T__22
				{
				mT__22(); 

				}
				break;
			case 5 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:34: T__23
				{
				mT__23(); 

				}
				break;
			case 6 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:40: T__24
				{
				mT__24(); 

				}
				break;
			case 7 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:46: INT
				{
				mINT(); 

				}
				break;
			case 8 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:50: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 9 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:58: WS
				{
				mWS(); 

				}
				break;
			case 10 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:61: ADDOP
				{
				mADDOP(); 

				}
				break;
			case 11 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:67: MULTOP
				{
				mMULTOP(); 

				}
				break;
			case 12 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:74: COMPOP
				{
				mCOMPOP(); 

				}
				break;
			case 13 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:81: READ
				{
				mREAD(); 

				}
				break;
			case 14 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:86: WRITE
				{
				mWRITE(); 

				}
				break;
			case 15 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:92: AFFECT
				{
				mAFFECT(); 

				}
				break;
			case 16 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:99: WHILE
				{
				mWHILE(); 

				}
				break;
			case 17 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:105: IF
				{
				mIF(); 

				}
				break;
			case 18 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:108: ELSE
				{
				mELSE(); 

				}
				break;
			case 19 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:113: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 20 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:121: VAR
				{
				mVAR(); 

				}
				break;
			case 21 :
				// /Users/camille/Documents/3A/TraitementDesLangages/KitBE_TdL/Niklaus.g:1:125: ID
				{
				mID(); 

				}
				break;

		}
	}



}
