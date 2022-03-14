package Fundamentals.Identifiers;

public class Identifier {
    public static void main(String args[]) {
        int i = 4;
        int I =4;
        int $1 =3;


        System.out.println("Hellow");
    }
}
/*Def -Identifier : A name in java program is called Identifier ,
which can be used for ,identification purpose ,it can be method name  or variable name ,class name  or label name
real time example :person names or born baby name
// Identifiers  are  in this program as 5
// "name of class is Identifier" ,
// " name of the method is main" ,
// "String is predefined class name String",
// name of the array args ",
// "name of the variable i" */


/*Rules for defining Java Identifiers
1. The only allowed characters in  java identifiers are (A to Z ,a to z ,0 to 9 ,$ ,_ ) ,if we are using any other characters ,we will get compile time error
EX : total_number -- -valid
     total#  --- in valid we can get compile time error
2. Identifiers can't start with digits
EX : total123  --valid
     123total ---invalid
3.Java identifiers are case-sensitive ofcourse java Language itself treated as  case-sensitive  programming language
EX : class test {
     int number =10;
     int Number =20;
     int NUMBER =30;
     }
we can difference write case
4.there is no length limit for java identifier but it is not recommended taking too lengthy identifier
5.we can't use reserved words as identifiers
EX :int x =10; ---valid
    int if =20; --- invalid  it is a reserved word
6.all predefined  java class name's and interface name's we can use as identifiers ,even thow it's a valid but it is not a good programming practice because
 its reduce readability and create confusion

EX 1 : class test(){
public static void main(String [] args){
int  String =10;
System .out.println(String);
}
}
//here String is a predefined class name
Ex 2 :
class test(){
public static void main(String [] args){
int Runnable =10;
System .out.println(Runnable);
}
}
//here Runnable is a predefined interface name
 */

/* which are the following are valid java identifiers
example : total_number --valid
          total#  --invalid
          123total ---invalid
          total123 --- valid
          $_$_$_$ --- valid
          Ca$h    --valid
          all@hands --invalid
          Jan2share -- valid
          Integer -- valid //all predefined  java class name's and interface name's we can use as identifiers
          Int  ---valid  //
          int --- in valid  //it is a reserved word
 */