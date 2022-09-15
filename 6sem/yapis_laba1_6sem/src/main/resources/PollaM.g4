grammar PollaM;

//��������� �� ������������� ����� ������� �� ����������� ������������� ������� (�� 0 � �����), � ����� ������������ ������� MAIN
program: (functionDefReturn | functionDefNonReturn)* mainDef;

//���������� ���� �����
type: SET
    | ELEMENT;

typeIdPart: type ID;

typeVarPart: type | VAR;

//������� ���������� ������� MAIN (������ ���������)
mainDef: DEF VOID MAIN OPEN_BRACKET CLOSE_BRACKET functionBodyWithoutReturn;

//������� ���������� ������� � ������������ ���������
functionDefReturn: DEF typeIdPart OPEN_BRACKET functionDefParameters? CLOSE_BRACKET functionBodyWithReturn;

//������� ���������� �������, ������� ������ �� ����������. ���������� �� ���������� �������� ���������� ������� � ������ ����� ������� (��� return)
functionDefNonReturn: DEF VOID ID OPEN_BRACKET functionDefParameters? CLOSE_BRACKET functionBodyWithoutReturn;

//���� ������� ��� ������������� �������� ������� �� N-��� ���������� ����� ����
functionBodyWithoutReturn: ((contentLine SEMICOLON) | operators)* emptRet;
emptRet: RETURN SEMICOLON;

//������� ������� � ������������ ��������� ������� � ������� ������������ ������ RETURN ��������
functionBodyWithReturn: ((contentLine SEMICOLON) | operators)* RETURN ID SEMICOLON;

//������ ���������� ���������� ������� -> ��� ���, ��� ���, ...
functionDefParameters: (typeIdPart COMMA)* typeIdPart;

//������ ���� ����� ���� ��������� �����:
// -�������� � ����������� (set)
// -���������� ��������
// -�������� ��������� ��������� (add, remove, clear, � ��)
// -���������� ����������, �� ����������, ����� �������
// -�����
// -����� ���������� ������� (print, clear, size)
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

//���������� ���������� (����� ����� �������� ������ ����� �������� ����� var)
variableDeclaration: typeVarPart ID;

//���������� ���������� ������ � ����������� ��������
variableDeclarationWithAssignment: typeVarPart valueAssignment;

//���������� �������� ����������. ����� ��������� ��������� ��������:
// -�����
// -�������� ������ ����������
// -������������ �� ������� ��������
valueAssignment: ID ASSIGN (NUMBER | typeConvertion | ID | sizeCall | operationsWithSets | functionCall
                                    | (OPEN_CURLY_BRACKET (((NUMBER | ID) COMMA)* (NUMBER | ID))? CLOSE_CURLY_BRACKET));

//���������� �����
typeConvertion: OPEN_BRACKET type CLOSE_BRACKET ID;

//����� �������
functionCall: ID OPEN_BRACKET ((ID COMMA)* ID)? CLOSE_BRACKET;

//�������� � ����������� �������� � ����:
// -�������� ����������� A?B={x|(x?A)?(x?B)}
// -�������� �������� A?B={x|(x?A)?(x?B)}
// -�������� ����������� A?B={x|(x?A)?(x?B)}
// -�������� ������������ �������� A?B=(A?B)?(B?A)
operationsWithSets: unionOperation
                    | differenceOperation
                    | intersectionOperation
                    | symmetricDifferenceOperation;

//�������� ��������� ��������� (����������|�������� element)
changeSetOperation: ID DOT (ADD | REMOVE) OPEN_BRACKET (ID | NUMBER) CLOSE_BRACKET;

//����������� ���������
unionOperation: ID UNION ID;

//�������� ���� ��������
differenceOperation: ID DIFERENCE ID;

//����������� ��������
intersectionOperation: ID INTERSECTION ID;

//�������������� ��������
symmetricDifferenceOperation: ID SYMMETRIC_DIFFERENCE ID;

//����������� ���������� ��������
booleanOperations: (ID|NUMBER) EQUALS (ID|NUMBER)
                    | (ID|NUMBER) GT_EQ (ID|NUMBER)
                    | (ID|NUMBER) LT_EQ (ID|NUMBER)
                    | (ID|NUMBER) NOT_EQUALS (ID|NUMBER)
                    | (ID|NUMBER) GT (ID|NUMBER)
                    | (ID|NUMBER) LT (ID|NUMBER)
                    | ID;

//���������� if �����. �� ������� ��: �if (���������� ���������) {���� ��� ����� ����� ����} else(�����������) {���� ��� ����� ����� ����}�
ifBlock: IF OPEN_BRACKET booleanOperations CLOSE_BRACKET
         operatorBody
         (ELSE operatorBody)?;

//���������� ���� for, ��� �������� ���� ���������
forBlock: FOR OPEN_BRACKET ID FROM ID CLOSE_BRACKET operatorBody;

//���������� ����� while
whileBlock: WHILE OPEN_BRACKET booleanOperations CLOSE_BRACKET operatorBody;

//���� ���������� for, while, if-then-else
operatorBody: ((contentLine SEMICOLON) | operators)* ((contentLine COLON) | operators);

//����� ������� PRINT
printCall: PRINT OPEN_BRACKET (ID | STRING | NUMBER) CLOSE_BRACKET;

//����� ������� SIZE
sizeCall: SIZE OPEN_BRACKET ID CLOSE_BRACKET;

//����� ������� CLEAR ��� ������� ���������
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