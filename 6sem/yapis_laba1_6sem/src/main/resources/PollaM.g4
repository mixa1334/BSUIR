grammar PollaM;

//программа на разработанном языке состоит из объявленных пользователем функций (от 0 и более), а также обязательной функции MAIN
program: (functionDefReturn | functionDefNonReturn)* mainDef;

//встроенные типы языка
type: SET
    | ELEMENT;

typeIdPart: type ID;

typeVarPart: type | VAR;

//правило объявления функции MAIN (начало программы)
mainDef: DEF VOID MAIN OPEN_BRACKET CLOSE_BRACKET functionBodyWithoutReturn;

//правило объявления функции с возвращаемым значением
functionDefReturn: DEF typeIdPart OPEN_BRACKET functionDefParameters? CLOSE_BRACKET functionBodyWithReturn;

//правило объявления функции, которая ничего не возвращает. Отличается от предыдущей наличием параметров функции и другим телом функции (без return)
functionDefNonReturn: DEF VOID ID OPEN_BRACKET functionDefParameters? CLOSE_BRACKET functionBodyWithoutReturn;

//тело функции без возвращаемого значения состоит из N-ого количества строк кода
functionBodyWithoutReturn: ((contentLine SEMICOLON) | operators)* emptRet;
emptRet: RETURN SEMICOLON;

//отличие функции с возвращаемом значением состоит в наличии обязательной строки RETURN значение
functionBodyWithReturn: ((contentLine SEMICOLON) | operators)* RETURN ID SEMICOLON;

//способ объявления параметров функции -> тип имя, тип имя, ...
functionDefParameters: (typeIdPart COMMA)* typeIdPart;

//строка кода может быть следующих видов:
// -операции с множествами (set)
// -логические операции
// -операции изменения множества (add, remove, clear, и др)
// -декларация переменных, их присвоение, вызов функции
// -циклы
// -вызов встроенных функций (print, clear, size)
contentLine: operationsWithSets
            | booleanOperations
            | changeSetOperation
            | variableDeclaration
            | valueAssignment
            | variableDeclarationWithAssignment
            | typeConvertion
            | functionCall
            | printCall
            | sizeCall
            | clearCall;

operators: ifBlock
           | forBlock
           | whileBlock;

//объявление переменных (также можно объявить неявно через ключевое слово var)
variableDeclaration: typeVarPart ID;

//объявление переменных вместе с присвоением значения
variableDeclarationWithAssignment: typeVarPart valueAssignment;

//присвоение значений переменной. Можно присвоить следующие значения:
// -число
// -значение другой переменной
// -возвращаемое из функции значения
valueAssignment: ID ASSIGN (NUMBER | typeConvertion | ID | sizeCall | operationsWithSets | functionCall
                                    | (OPEN_CURLY_BRACKET (((NUMBER | ID) COMMA)* (NUMBER | ID))? CLOSE_CURLY_BRACKET));

//приведение типов
typeConvertion: OPEN_BRACKET type CLOSE_BRACKET ID;

//вызов функции
functionCall: ID OPEN_BRACKET ((ID COMMA)* ID)? CLOSE_BRACKET;

//операции с множествами включают в себя:
// -операцию объединения A?B={x|(x?A)?(x?B)}
// -операцию разности A?B={x|(x?A)?(x?B)}
// -операцию пересечения A?B={x|(x?A)?(x?B)}
// -операцию симметричной разности A?B=(A?B)?(B?A)
operationsWithSets: unionOperation
                    | differenceOperation
                    | intersectionOperation
                    | symmetricDifferenceOperation;

//операции изменения множества (добавление|удаление element)
changeSetOperation: ID DOT (ADD | REMOVE) OPEN_BRACKET (ID | NUMBER) CLOSE_BRACKET;

//объединение множества
unionOperation: ID UNION ID;

//разность двух множеств
differenceOperation: ID DIFERENCE ID;

//пересечение множеств
intersectionOperation: ID INTERSECTION ID;

//симметрическая разность
symmetricDifferenceOperation: ID SYMMETRIC_DIFFERENCE ID;

//стандартные логические операции
booleanOperations: (ID|NUMBER) EQUALS (ID|NUMBER)
                    | (ID|NUMBER) GT_EQ (ID|NUMBER)
                    | (ID|NUMBER) LT_EQ (ID|NUMBER)
                    | (ID|NUMBER) NOT_EQUALS (ID|NUMBER)
                    | (ID|NUMBER) GT (ID|NUMBER)
                    | (ID|NUMBER) LT (ID|NUMBER)
                    | ID;

//объявление if блока. Он состоит из: «if (логическое выражение) {ноль или более строк кода} else(опционально) {ноль или более строк кода}»
ifBlock: IF OPEN_BRACKET booleanOperations CLOSE_BRACKET
         operatorBody
         (ELSE operatorBody)?;

//объявление цикл for, для перебора всех элементов
forBlock: FOR OPEN_BRACKET ID FROM ID CLOSE_BRACKET operatorBody;

//объявление блока while
whileBlock: WHILE OPEN_BRACKET booleanOperations CLOSE_BRACKET operatorBody;

//тело операторов for, while, if-then-else
operatorBody: ((contentLine SEMICOLON) | operators)* ((contentLine COLON) | operators);

//вызов функции PRINT
printCall: PRINT OPEN_BRACKET (ID | STRING | NUMBER) CLOSE_BRACKET;

//вызов функции SIZE
sizeCall: SIZE OPEN_BRACKET ID CLOSE_BRACKET;

//вызов функции CLEAR для очистки множества
clearCall: CLEAR OPEN_BRACKET ID CLOSE_BRACKET;

MAIN: 'main';
DEF: 'def';
VOID: 'void';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
RETURN: 'return';
FROM: 'from';

SET: 'set';
ELEMENT: 'element';
VAR: 'var';

PRINT: 'print';

SIZE: 'size';
CLEAR: 'clear';
ADD: 'add';
REMOVE: 'remove';

ID : [a-zA-Z_]+;
STRING: '"'(.)+?'"';
NUMBER: '0' | '-'?[1-9][0-9]*;

COLON: ':';
SEMICOLON: ';';
DOT: '.';
COMMA: ',';
ASSIGN: '=';
UNION: '+';
DIFERENCE: '-';
INTERSECTION: '&';
SYMMETRIC_DIFFERENCE: '^';
EQUALS: '==';
NOT_EQUALS: '!=';
GT_EQ: '>=';
LT_EQ: '<=';
GT: '>';
LT: '<';

OPEN_BRACKET : '(';
CLOSE_BRACKET : ')';
OPEN_CURLY_BRACKET : '{';
CLOSE_CURLY_BRACKET : '}';

WS: [ \t\r\n]+ -> skip;