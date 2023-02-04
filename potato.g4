grammar potato;

/*
 Parser rules
 */

start: includeStatement*? statement* EOF;

statement:
	declaration
	| expression SEMICOLON
	| ifStatement
	| forStatement
	| whileStatement
	| doWhileStatement
	| switchStatement
	| functionDeclaration
	| exception
	| classDeclaration
	| methodCall SEMICOLON
	| printStatement SEMICOLON
	| ternarystatement SEMICOLON;

// import statement
includeStatement:
	HASHTAG INCLUDE IDENTIFIER (
		DOT IDENTIFIER (
			COMMA (LINE DOT)? IDENTIFIER (DOT IDENTIFIER)?
		)*
	)? (ARROW IDENTIFIER)? SEMICOLON;

// if statement

ifStatement:
	IF expression ((OR | AND | NOT) expression)? block (
		ELIF expression block
	)*? (ELSE block)?;

// for statement
forStatement: forLoop | forIn;
forLoop:
	FOR OPEN_PAREN datatype expression SEMICOLON expression SEMICOLON expression CLOSE_PAREN block;
forIn: FOR IDENTIFIER IN IDENTIFIER block;

// while statement
whileStatement: WHILE OPEN_PAREN expression CLOSE_PAREN block;

// do while statement
doWhileStatement:
	DO block WHILE OPEN_PAREN expression CLOSE_PAREN SEMICOLON;

// switch statement
switchStatement:
	SWITCH (expression | IDENTIFIER DOT IDENTIFIER) switchBlock;

switchBlock:
	OPEN_BRACE (
		CASE literal COLON (
			(statement+ breakStatement?)
			| breakStatement
		)
	)+ (
		DEFAULT COLON (
			(statement+ breakStatement?)
			| (breakStatement)
		)
	)? CLOSE_BRACE;
breakStatement: BREAK SEMICOLON;

// function
functionDeclaration:
	datatype IDENTIFIER parameterList functionBody;
parameterList:
	OPEN_PAREN (parameter (COMMA parameter)*?)? CLOSE_PAREN;
parameter: datatype IDENTIFIER (ASSIGN expression)?;
functionBody:
	OPEN_BRACE includeStatement*? (statement | returnStatement)*? CLOSE_BRACE;
returnStatement: RETURN (expression | NULL) SEMICOLON;
functionCall: IDENTIFIER argumentList;
argumentList:
	OPEN_PAREN (expression (COMMA expression)*?)? CLOSE_PAREN;

// exception handling exception: TRY block ((onCatchPart+ catchPart?) | catchPart);
exception:
	TRY block EXCEPT (
		IDENTIFIER (COMMA IDENTIFIER)* AS IDENTIFIER
	) block;

// class
classDeclaration:
	CLASS IDENTIFIER (EXTENDS IDENTIFIER)? (
		IMPLEMENTS IDENTIFIER (WITH IDENTIFIER)*
	)? classBody;
classBody:
	OPEN_BRACE fieldDeclaration* constructor methodDeclaration* CLOSE_BRACE;
fieldDeclaration: accessModifier? declaration;
methodDeclaration: accessModifier? functionDeclaration;
constructor: PUBLIC? IDENTIFIER parameterList functionBody;
instantiation: IDENTIFIER ASSIGN2 objectConstruction;
methodCall:
	IDENTIFIER DOT (IDENTIFIER DOT)*? IDENTIFIER argumentList;
objectConstruction:
	NEW IDENTIFIER OPEN_PAREN (expression (COMMA expression)*)? CLOSE_PAREN;
//ternary
ternarystatement: ((IDENTIFIER ASSIGN)| RETURN) expression QUESTIONMARK expression COLON IDENTIFIER;
// variable decleration and assignment
declaration:
	variableType? (definition | instantiation) (
		COMMA (definition | instantiation)
	)*? SEMICOLON;
definition:
	datatype IDENTIFIER (typeDefinition)? (ASSIGN2 expression)?;

typeDefinition:
	datatype
	| NEW ARRAY OPEN_BRACKET datatype CLOSE_BRACKET OPEN_BRACKET NUMBER_LITERAL CLOSE_BRACKET;
value:
	literal
	| arrayConstruction
	| IDENTIFIER
	| functionCall
	| methodCall
	| objectConstruction;
variableType: VAR | CONST;
accessModifier: PRIVATE | PUBLIC | PROTECTED;
datatype: BOOL | INT | FLOAT | STRING | DOUBLE | VOID;
arrayConstruction:
	ARRAY OPEN_PAREN expression (COMMA expression)*? CLOSE_PAREN;

// operators
stringLiteral:
	DOUBLE_QUOTATION (simpleStringLiteral | complexStringLiteral)* DOUBLE_QUOTATION;
simpleStringLiteral: ((~DOLLAR) | (BACK_SLASH DOLLAR))+;
complexStringLiteral: DOLLAR OPEN_BRACE expression CLOSE_BRACE;
literal: stringLiteral | NUMBER_LITERAL | BOOLEAN_LITERAL;

assignmentOperators:
	ASSIGN
	| PLUS_ASSIGN
	| MINUS_ASSIGN
	| MULTIPLY_ASSIGN
	| DIVIDE_ASSIGN
	| MODULUS_ASSIGN;

expression: n | expression assignmentOperators n;
n: o | NOT n | n OR o | n AND o;
o:p| o LESS_THAN p| o GREATER_THAN p| o LESS_THAN_EQUALS p| o GREATER_THAN_EQUALS p;
p: q | p EQUALS q | p NOT_EQUALS q;
q: r | q BIT_AND r | BIT_NOT q | q BIT_OR r;
r: s | r BIT_SHIFT_LEFT s | r BIT_SHIFT_RIGHT s;
s: t | s PLUS t | s MINUS t;
t: u | t MULTIPLY u | t DIVIDE u | t MODULUS u;
u:v| u PLUS_PLUS| PLUS_PLUS u| u MINUS_MINUS| MINUS_MINUS u;
v: w | MINUS v | PLUS v;
w: x | OPEN_PAREN expression CLOSE_PAREN | w DOT IDENTIFIER;
x: value;

block: OPEN_BRACE statement*? returnStatement? CLOSE_BRACE;

printStatement:
	PRINT OPEN_PAREN DOUBLE_QUOTATION? IDENTIFIER DOUBLE_QUOTATION? (
		COMMA DOUBLE_QUOTATION? IDENTIFIER DOUBLE_QUOTATION?
	)* CLOSE_PAREN;
/*
 Lexer rules
 */
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
LINE: '_';
HASHTAG: '#';
DOUBLE_QUOTATION: '"';
SEMICOLON: ';';
COMMA: ',';
ASSIGN: '=';
COLON: ':';
DOT: '.';
PLUS_PLUS: '++';
MINUS_MINUS: '--';
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULUS: '%';
LESS_THAN: '<';
GREATER_THAN: '>';
BIT_SHIFT_LEFT: '<<';
BIT_SHIFT_RIGHT: '>>';
BIT_AND: '&';
BIT_OR: '|';
BIT_NOT: '^';
LESS_THAN_EQUALS: '<=';
GREATER_THAN_EQUALS: '>=';
EQUALS: '==';
NOT_EQUALS: '!=';
AND: 'and';
OR: 'or';
NOT: 'not';
MULTIPLY_ASSIGN: '*=';
DIVIDE_ASSIGN: '/=';
MODULUS_ASSIGN: '%=';
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
ARROW: '=>';
DOLLAR: '$';
BACK_SLASH: '\\';
ASSIGN2: '<-';
QUESTIONMARK: '?';

// Keywords

IF: 'if';
ELSE: 'else';
ELIF: 'elif';
FOR: 'for';
IN: 'in';
WHILE: 'while';
DO: 'do';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';
BREAK: 'break';
ARRAY: 'Array';
NEW: 'new';
INCLUDE: 'include';
FROM: 'from';
RETURN: 'return';
TRY: 'try';
CATCH: 'catch';
ON: 'on';
CLASS: 'class';
IMPLEMENTS: 'implements';
EXTENDS: 'extends';
WITH: 'with';
VOID: 'Void';
EXCEPT: 'except';
AS: 'as';
PRINT: 'print';

// primitive data types
INT: 'int';
STRING: 'string';
BOOL: 'bool';
FLOAT: 'float';
DOUBLE: 'double';
NULL: 'Null';

// access modifiers
PRIVATE: 'private';
PUBLIC: 'public';
PROTECTED: 'protected';

// variable type
VAR: 'var';
CONST: 'const';

BOOLEAN_LITERAL: 'true' | 'false';

NUMBER_LITERAL:
	INTEGER_LITERAL
	| FLOAT_LITERAL
	| EXPONENT_LITERAL;
IDENTIFIER: ALPHA ALPHA_NUM+;

MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;

SINGLE_LINE_COMMENT: '//' ~[\r\n]* -> skip;

WHITE_SPACE: [ \t\n\r]+ -> skip;

ALPHA: [a-zA-Z$_];

ALPHA_NUM: [a-zA-Z0-9$_];

INTEGER_LITERAL: '0' | NON_ZERO_DIGIT DIGIT*;

FLOAT_LITERAL: INTEGER_LITERAL? FRACTION_PART;

EXPONENT_LITERAL: DIGIT? '.' DIGIT+ EXPONENT_PART;

FRACTION_PART: '.' DIGIT+;

EXPONENT_PART: [eE] [+-]? DIGIT+;

NON_ZERO_DIGIT: [1-9];

DIGIT: [0-9];