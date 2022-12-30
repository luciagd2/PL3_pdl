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

VAR: [a-z][a-zA-Z0-9_]*;
COMP: '<'|'>'|'=='|'!='|'<='|'>=';
LOG: '&&'|'||'|'##';
OPNEG: '!';
PI: '(';
PD: ')';
CI: '{';
CD: '}';
IG: '=';
BB: '_';
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
POL:'\''SUMRES?MON((SUMRES)?MON)*'\'';
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
