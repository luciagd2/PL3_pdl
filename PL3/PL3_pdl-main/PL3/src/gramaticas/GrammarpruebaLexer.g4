lexer grammar GrammarpruebaLexer;

// import GrammarpruebaFragments;

@header {
	package gramaticas;
}

//Keywords
LET: 'let';
IF: 'if';
WHILE: 'while';
FUNCT: 'function ';
RET: 'return';
VAL: 'val';
PRINT: 'print';

VAR: ([a-zA-Z]+)INT?;
COMP: '<'|'>'|'=='|'!='|'<='|'>=';
LOG: '&&'|'||'|'##'|'!';
PI: '(';
PD: ')';
CI: '{';
CD: '}';
IG: '=';
SUMRES: '+'|'-';
MULDIVMOD: '*'|'/'|'%';
EXP: '^';
COMA: ',';
COMILLA: '\'';

//Tipos de datos
NUM: INT|FLOAT;
fragment INT: [0-9]+;
fragment FLOAT: INT('.'INT);

TXT: '"' ().*? '"';

POL:'\'' MON(('+'|'-')MON)* '\'';
fragment MON: (CHR('^'INT)?)|INT;
fragment CHR: [a-z];

//Separadores
FIN: ';';
NEWLINE: [\r\n]+->skip;
TAB: [\t]+->skip;
COMMENT: (COMENTARIOCOMPL|COMENTARIOLINEA) -> skip;
COMENTARIOLINEA: '%%%' ().*? NEWLINE;
COMENTARIOCOMPL: '***' ().*? '***';
WS: ' '+->skip;
