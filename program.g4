grammar program;
start: (librarystatement*)?  statment* ' '*EOF;
statment: exp|(functioncallstatement)|(classStatement)|(functionstatement)|(variablestatement)|(printstatement)|(objectstatement)|(ifstatement)|(ternarystatement)|(forstatement)|(whilestatement)|(switchstatement)|(exceptionstatement)|(operatorsstatement);
//library//
librarystatement: '#' 'include' ' '(library)(', 'library)*';';
library: (libraryname) ('.'(libraryfunc)((' => ' (funcname))|(', _.'(libraryfunc))*))*;
libraryname: VAR;
libraryfunc: VAR;
funcname: VAR;
//variable//
variablestatement: (variable)((' ')*', '' '*(variable))*' '* ';';
variable:(' ')*((situation)' '+)?((const)' '+)? (datatype);
situation: PUBLIC|PRIVATE;
const: CONST;
datatype: stringstate|boolstate|intstate|floatstate|arraystate|doublestate;
stringstate: ((STRING)' '+)?(variablename)' '*('<-'' '*('"'((' ')*initialvalue(' ')*)*'"')' '*)?;
boolstate: ((BOOLEAN)' '+)?(variablename)' '*('<-'' '*('true'|'false')' '*)?;
intstate: ((INT)' '+)?(variablename)' '*('<-'' '*('-'|'+')?(initialnumber)' '*)?;
floatstate: ((FLOAT)' '+)?(variablename)' '*('<-'' '*('-'|'+')?(initialnumber('.'(initialnumber)*)?)' '*)?;
doublestate: ((DOUBLE)' '+)?(variablename)' '*('<-'' '*('-'|'+')?(initialnumber('.'(initialnumber)*)?)' '*)?;
arraystate: simplearraystate|floatarraystate|intarraystate|doublearraystate|stringarraystate;
simplearraystate: (dtyp)(' ')+(variablename)'[]'(' ')*('<-'(' '*'new '' '*dtyp'['(initialnumber)']'))?;
floatarraystate: ARRAY' '+FLOAT' '+variablename'[]'' '*'<-'' '* '['' '*(initialnumber('.'(initialnumber)*)?)(' '*(', '|',')initialnumber('.'(initialnumber)*)?)*' '*']';
intarraystate: ARRAY ' '+ INT' '+variablename'[]'' '*'<-'' '* '['' '*(initialnumber)(' '*(', '|',')initialnumber)*' '*']';
stringarraystate: ARRAY ' '+ STRING' '+variablename'[]'' '*'<-'' '* '['' '*('"'variablename'"')(' '*(', '|',')'"'' '*variablename'"')*']';
doublearraystate: ARRAY ' '+ DOUBLE' '+variablename'[]'' '*'<-'' '* '['' '*(initialnumber)(' '*(', '|',')initialnumber)*' '*']';
dtyp: INT|FLOAT|BOOLEAN|STRING|DOUBLE;
variablename: VAR any*;
any: VAR|NUM|SGN;
initialvalue: VAR;
initialnumber: NUM;
INT: 'int';
FLOAT: 'float';
STRING: 'string';
DOUBLE: 'double';
BOOLEAN: 'boolean';
CONST: 'const';
PRIVATE: 'private';
PUBLIC: 'public';
ARRAY: 'array';

//class//
classStatement: class;
class: 'class'' '+(classname)' '+(EXTEND' '+(variablename))?(IMPLEMENT' '+(variablename)' '+(WITH' '+(variablename))(' '*(','|', ') ' '* variablename)*)?' '*'{'(classbody+)'}';
classname: VAR;
classbody:(variablestatement)|(constructor)|(functionstatement)|ifstatement|exp|forstatement|whilestatement;
constructor: (classname)(' ')*'('(' ')*((dtyp)' '(variablename))(' ')*(','(dtyp)' '(variablename))*(' ')*')'(' ')*'{'(' ')*(constructorbody)(' ')*'}';
constructorbody: (' ')*((' ')*constvardeclaration(' ')*)+(' ')*;
constvardeclaration: 'this.'(variablename)(' ')* '=' (' ')*(variablename)(';');
EXTEND: 'extends';
IMPLEMENT: 'implements';
WITH: 'with';
//function//
functionstatement:(dtyp)' '+(functionname)' '*'('(' '*)(parameter_list)')'(' ')*'{'(' ')*(functionbody*(returnstatement)?)(' ')*'}';
parameter_list: (parameter)(' '*', 'parameter)*;
parameter: ((dtyp)' '(variablename))|(dtyp)' '(variablename)(' ')*'='(' ')*(parametervalue)(' ')*;
functionname: VAR;
parametervalue: 'True'|'False'|'"'(variablename)'"'|initialnumber;
functionbody: (variablestatement)|exp|(ifstatement)|(forstatement)|(whilestatement);
returnstatement: 'return'(' ')*(' Null'|'"'variablename'"'|initialnumber|variablename)' '*';'(' ')*;
//function call
functioncallstatement: variablename '.'(funcname)'('')'';';
//object//
objectstatement: object;
object: (' ')*((situation)' '+)?((const)' '+)?(classname)(' ')+(objectname)(' ')*(('<-')(valtyp))?(' ')*';';
valtyp: valtyp1|valtyp2;
valtyp1: ((' ')*' new '(' ')*(classname)'('' '*(objvalues)' '*')');
valtyp2: ' '*(NULL);
objvalues: (objvalue)*' '*(' '*(','|', ')' '*objvalue)*;
objvalue: '"'(variablename)'"'|initialnumber|initialnumber'.'initialnumber;
objectname: VAR(NUM)*;
NULL: ' Null';
//if//
ifstatement: 'if'(' ')*(condition)(' ')*'{'(' ')*(ifbody*)(' ')*'}'(elif)*(else)*;
elif: 'elif' (' ')* (condition) (' ')* '{'(' ')*(ifbody*)(' ')*'}';
else: 'else'' '* '{'(' ')*(ifbody)*(' ')*'}';

//ternary expretion//
ternarystatement: (((variablename)' = ')|'return')?(variablename|condition)' ''?'' '*(initialnumber|'('operatorsstatement')'|'"'variablename'"'|variablename)' '':'' '(initialnumber|'('operatorsstatement')'|'"'variablename'"'|variablename)(';');
condition:  exp*;
expression: VAR(NUM)*;
ifbody:(variablestatement)|(returnstatement)|(ifstatement)|(forstatement)|(whilestatement)|(objectstatement)|(exp)|(printstatement);
//switch//
switchstatement: 'switch '' '* (switchexpression)' '*'{'(' ')*(casestatement)+ (' ')*(defaultstatement)'}';
casestatement: 'case '(casevalue|'"'casevalue'"')' '*':'(' '*)(casebody*)' '*('break;')?;
defaultstatement: 'default'' '*':'(' '*)(defaultbody*);
defaultbody: ifbody;
casebody: ifbody;
switchexpression: VAR(NUM)*'.'?VAR*;
casevalue: VAR(NUM)*;


//for simple for part 2 haves a problem//
forstatement: (iterativefor)|(simplefor);
simplefor: ('for'|'for ')' '*'('(' ')*(simpleforpart1)(simpleforpart2)(simpleforpart3)')'(' '*)'{'(loopbody+)' '*'}';
iterativefor:('for '|'for')(variablename)(' '+)('in')(' '+)(variablename)(' '*)'{'(loopbody+)' '*'}';
simpleforpart1:(dtyp)' '(variablename)(' ')*('=')(' ')*('"'variablename'"'|initialnumber|TRUE|FALSE)(' ')*';';
simpleforpart2: exp*';';
andorstatement:(andstatement|orstatement);
simpleforpart3:(' '*)exp(' '*);
TRUE: 'True';
FALSE: 'False';

//while//
whilestatement: dowhile|while;
dowhile: 'do''{'(' ')*(loopbody+)(' '*)'}'(' ')*'while''('(' ')*(whilecondition)+(' ')*')';
while: 'while'(' '*)'('(whilecondition)')'(' '*)'{'(' ')*(loopbody+)(' ')*'}';
whilecondition: exp;
loopbody:(variablestatement)|(ifstatement)|(forstatement)|(whilestatement)|(objectstatement)|(exp)|(printstatement);
//exception//
exceptionstatement: (trystatement)(exceptstatement);
trystatement: 'try'(' ')*'{'(' ')*(trybody*)(' ')*'}';
trybody: ifbody;
exceptstatement: 'except'(variablename((', '|',')' '*'as' ' '* variablename))?(' ')*'{'(' ')*(exceptbody*)(' ')*'}';
exceptbody: ifbody;
//operators//
operatorsstatement:sumstatement|substatement|powstatement|multiplystatement|dividestatement|remainstatement;
comparestatement: gt|egt|lt|elt|equal|equal2|not;
gt: (' '*)(variablename)(' '*)'>'(' '*)(variablename|initialnumber|TRUE|FALSE)(' '*);
egt: (' '*)(variablename)(' '*)'>='(' '*)(variablename|initialnumber|TRUE|FALSE)(' '*);
lt: (' '*)(variablename)(' '*)'<'(' '*)(variablename|initialnumber|TRUE|FALSE)(' '*);
elt: (' '*)(variablename)(' '*)'<='(' '*)(variablename|initialnumber|TRUE|FALSE)(' '*);
equal: (' '*)(variablename)(' '*)'='(' '*)(variablename|initialnumber|TRUE|FALSE)(' '*);
equal2:  (' '*)(variablename)(' '*)'=='(' '*)(variablename|initialnumber|TRUE|FALSE)(' '*);
not:  (' '*)(variablename)(' '*)'!='(' '*)(variablename|initialnumber|TRUE|FALSE)(' '*);
orstatement: '||'|'or';
andstatement: '&&'|'and';
notstatement: 'not';
notstatement2:  '!'variablename;
signnum: '-'|'+' variablename;
sumstatement: sumstatement1|sumstatement2|sumstatement3;
sumstatement1: (variablename(' ')* ('='|'= '))?(' ')*(variablename|initialnumber)(' ')*'+'(' ')*(variablename|initialnumber)(';')?;
sumstatement2: variablename'++'(';')?;
sumstatement3: variablename ' '* '+=' ' '*(variablename|initialnumber)(';')?;
substatement: substatement1|substatement2|substatement3;
substatement1: (variablename(' ')* ('='|'= '))?(' ')*(variablename|initialnumber)(' ')*'-'(' ')*(variablename|initialnumber)(';')?;
substatement2: variablename'--'(';')?;
substatement3: variablename ' '* '-=' ' '*(variablename|initialnumber)(';')?;
powstatement: (variablename(' ')*('='|'= '))?(' ')*variablename '*' (variablename|initialnumber)';';
multiplystatement: (variablename ((' '*) ('='|'= '))? (' '*))(variablename|initialnumber)(' ')*'*'(' ')*(variablename|initialnumber)(';')?;
dividestatement: (variablename('='|'= '))?(' ')*(variablename|initialnumber)(' ')*('/')(' ')*(variablename|initialnumber)(';')?;
remainstatement: (variablename(' ')*(' ='|'='|'= '))?(' ')*(variablename|initialnumber)(' ')*'%'(' ')*(variablename|initialnumber)(';')?;
printstatement: 'print''('printbody (' '*(','|', ')' '*printbody)?')'';';
powerstatement: (variablename ((' '*) ('='|'= '))? (' '*))(variablename|initialnumber)(' ')*'**'(' ')*(variablename|initialnumber)(';')?;
dividestatement3: variablename ' '* '/=' ' '*(variablename|initialnumber)(';')?;
powerstatement3: variablename ' '* '**=' ' '*(variablename|initialnumber)(';')?;
multiplystatement3:  variablename ' '* '*=' ' '*(variablename|initialnumber)(';')?;
remainstatement3: variablename ' '* '%=' ' '*(variablename|initialnumber)(';')?;
printbody: (variablename*|operatorsstatement|'"'(' '*)(variablename)*(' '*)'"');
exp: '('' '*operatorsstatement' '*')'|a;
a: powerstatement | b;
b: notstatement2 | c;
c: signnum|d;
d: substatement2|sumstatement2|f;
f: powerstatement|dividestatement|remainstatement|g;
g: substatement1|sumstatement1|h;
h: '<<'|'>>'|i;
i: '&' | '^'| '|'| j;
j: equal2|not|k;
k: gt|egt|lt|elt|l;
l: andstatement|orstatement|notstatement|m;
m:equal|sumstatement3|substatement3|dividestatement3|powerstatement3|multiplystatement3|remainstatement3;
WS: [ \t\r\n\b]+ -> skip;
fragment NUMBER: [0-9];
fragment LETTER: [a-zA-Z];
fragment SIGNS: [$_];
fragment EQUALSIGN: [=];
VAR: LETTER+;
EQSGN: EQUALSIGN+;
NUM: NUMBER+;
SGN: SIGNS+;
COMMENT
    : '/*' .*? '*/' -> channel(2)
    ;

LINE_COMMENT
    : '//' ~[\r\n]* -> channel(2)
    ;

