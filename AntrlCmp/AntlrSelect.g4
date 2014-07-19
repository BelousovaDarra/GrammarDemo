grammar AntlrSelect;

select : 'select' result_column ( ',' result_column )*
 'from' from_clause
   ( 'where' expr )? EOF;

table_or_subquery
 :  table_name ( 'as'? name )?
 | '(' select ')' ( 'as'? name )?
 ;

 from_clause
  : table_or_subquery ( 'inner'? 'join' table_or_subquery 'on' expr )*
  ;

expr
 : literal_value
 | ( table_name '.' )? IDENTIFIER
 | expr '||' expr
 | expr ( '*' | '/' | '%' ) expr
 | expr ( '+' | '-' ) expr
 | expr ( '<<' | '>>' | '&' | '|' ) expr
 | expr ( '<' | '<=' | '>' | '>=' ) expr
 | expr ( '=' | '==' | '!=' | '<>' ) expr
 | expr 'and' expr
 | expr 'or' expr
 | '(' expr ')'
 ;

result_column
    : '*'
    | name (('.' '*')|('as'? name))?
    | '('select')' ( 'as'? name )?
    | '('expr')' ( 'as'? name )?
    ;

table_name
 : name
 ;

name
 : IDENTIFIER
 | STRING_LITERAL
 | '(' name ')'
 ;

 literal_value
  : NUMERIC_LITERAL
  | STRING_LITERAL;

 IDENTIFIER
  : '"' (~'"' | '""')* '"'
  | '`' (~'`' | '``')* '`'
  | '[' ~']'* ']'
  | [a-zA-Z_] [a-zA-Z_0-9]*
  ;

  NUMERIC_LITERAL
   : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
   | '.' DIGIT+ ( E [-+]? DIGIT+ )?
   ;

  STRING_LITERAL
   : '\'' ( ~'\'' | '\'\'' )* '\''
   ;

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];