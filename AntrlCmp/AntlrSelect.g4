grammar AntlrSelect;

select : 'select' column ( ',' column )*
 ('from' from_clause
   ( 'where' expr )?
   ('order' 'by' IDENTIFIER (','IDENTIFIER)*)?
   ('limit' NUMERIC_LITERAL )?
   )?;

table_or_subquery
 :  table_name ( 'as'? name )?
 | '(' select ')' ( 'as'? name )?
 ;

 from_clause
  : table_or_subquery ( 'inner'? 'join' table_or_subquery 'on' expr )*
  ;

expr
 : constv
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

column
    : '*'
    | name (('.' '*')|('as'? name))?
    | '('select')' ( 'as'? name )?
    | expr ( 'as'? name )?
    ;

table_name
 : name
 ;

name
 : IDENTIFIER
 | STRING_LITERAL
 | '(' name ')'
 ;

constv
  : NUMERIC_LITERAL
  | STRING_LITERAL;

IDENTIFIER
  : '"' (~'"' | '""')* '"'
  //| '`' (~'`' | '``')* '`'
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

fragment E : [eE];