package Fundamentals.DataTypes;

public class DataType {

    public static void main(String args[]){
       byte b= '0';
       // short s=true;
        System.out.println(b);

    }
}
/* Data Types :
1.In java every variable  and every expression has some type
2.Each and every data type is clearly defined
3.Every assignment should be checked by compiler for type compatibility
because of above reason we can conclude java language is strongly typed programming language

**Java is not considered as pure object orient programming language ,because several oops futures are not satisfied by jave like (operator overloading ,multiple inheritance extra )
more over we are depending on primitive data types which are non objects
/* Example :class students marks compare to another student is strong ,check there alone is student is weak
Durga marks 2/100
ravi marks 0/100
relative compare to ravi Durga is strong
check Durga alone is checked its weak/fail

same like  compare java with another old programming language it is as pure object orient programming language
check Java alone it is a not pure object orient programming language
several oops  not working,more over depending on primitive data types


                                                             primitive data types (8)

                       numeric data types                                                       Non-numeric data type

  Integral datatype                    Floating point datatype                             char                    boolean

  byte,short,int ,long                     float, double

**.except boolean and char remaining data types consider as "signed data types"  because we can represent both positive and negative numbers
1. byte :
size =1 byte (8 bits)
max_value = +127
min_value = -128
range = +127 to -128

msb :most significant bit
 x      1     1    1     1     1     1     1
 msb   2^6   2^5  2^4   2^3   2^2   2^1   2^0
+or-  64    32   16    8     4     2     1

0 +ve
1  _ve


Then most significant bit acts as sign bit
0 means positive number
1 means negative number
positive numbers will be represented directly in memory
where as  negative numbers will be represented two's complement form

 Ex1 :
 public class DataType {

    public static void main(String args[]){
        byte b="10";
        System.out.println(b);
 }
}
ANS : 10


  Ex2 :
 public class DataTyp {

    public static void main(String args[]){
        byte b="tree";
        System.out.println(b);
 }
}
ANS : java: incompatible types: java.lang.String cannot be converted to byte



 Ex3 :
 public class DataType {

    public static void main(String args[]){
        byte b=false;
        System.out.println(b);
 }
}
ANS : java: incompatible types: boolean cannot be converted to byte


  Ex4 :
 public class DataTyp {

    public static void main(String args[]){
        byte b=10.5;
        System.out.println(b);
 }
}
ANS : java: incompatible types: possible lossy conversion from double to byte

Ex5 :
 public class DataTyp {

    public static void main(String args[]){
        byte b='10';
        System.out.println(b);
 }
}
ANS : java: unclosed character literal

Ex6 :
 public class DataTyp {

    public static void main(String args[]){
        byte b='0';
        System.out.println(b);
 }
}
ANS : 48

 ***byte is the best choice if we want to handle data in terms of streams either from the file or from the network (file supported , network supported form is byte)

 */


