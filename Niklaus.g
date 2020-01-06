grammar Niklaus;

options {
   output = AST;
}

expr		:	term (ADDOP^ term)*;

term		:	factor (MULTOP^ factor)*;

factor		:	ID | INT | ( '('! expr ')'! );

comparaison 	: 	expr COMPOP^ expr;

read		: 	READ^ ID ';'! ;

write		:	WRITE^ expr ';'!;

affectation	:	ID AFFECT^ expr ';'!;

loop		:	WHILE^ '('! comparaison ')'! '{'! instruction '}'!;

condition	:	IF^ '('! comparaison ')'! '{'! instruction '}'! ELSE '{'! instruction '}'!;

instruction	:	(comparaison | read | write | affectation | loop | condition)* ;

program		:	PROGRAM^ ID ';'!  declaration?  '{'! instruction '}'! ; 

declaration	:	VAR^ ( ID ','! )* ID ';'! ; 

INT :	'0'..'9'+
    ;
    
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

ADDOP	:	'+' | '-' | 'mod' ;

MULTOP	:	'*' | '/';

COMPOP	:	'<' | '<=' | '=' | '<>' | '>=' | '>' ;

READ	:	'read';

WRITE	:	'write';

AFFECT	:	':=';

WHILE	:	'while';

IF	:	'if';

ELSE	:	'else';

PROGRAM	:	'program';

VAR	:	'var';

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;