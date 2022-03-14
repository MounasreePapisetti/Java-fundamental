|Data type|size       |Range                                       |  Corsponding class | default value|
|---------|----------|---------------------------------------------|-------------       |----------|
|byte     | 1 bytes  |-2^7 to 2^7-1(-128 to 127)                   | byte        |0|
|short    |2 bytes   |-2^15 to 2^15-1(-32768 to 32767)             |  short      |0|
|int      | 4 bytes  |-2^31 to 2^31-1(-2147483648 to 2147483647)   | integer     |0|
|long     | 8 bytes  |-2^63 to 2^63-1                              | Long        |0|
|float    | 4 bytes  |-3.4e38 to 3.4e38                            |Float |0.0|
|double   | 8 bytes  |-1.7e308 to1.7e308                           |Double|0.0|
|boolean  | NA       | NA[but allowed true/false]                  |Boolean | false|
|char     | 2 bytes | 0 to 65535                                   |characters |0 -its represent space characters|

Note  : "null is the default value for object reference" and we can't apply for primitives ,if we are trying to use for primitive then we will get compile time error
EX :char ch =null;

public class Booleantype {
public static void main(String[] args) {
char ch ='null';
System.out.println("ch");
}
}
}
ANS : incompatible types : unclosed character literal