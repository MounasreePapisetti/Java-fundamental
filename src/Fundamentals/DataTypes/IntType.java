package Fundamentals.DataTypes;

public class IntType {
    public static void main(String args[]){
        int x = 10;
        System.out.println(x);
    }
}
/* int :
The  most commonly used data type in java is "int"
size :4 bytes [32 bits ]
Range :-2^31 to 2^31 -1
 [-2147483648 to 2147483647]

 Ex1 :
 public class IntType {
    public static void main(String args[]){
        int x = 2147483648;
        System.out.println(x);
    }
}
ANS : integer number too large
------------------------------------
 Ex1 :
 public class IntType {
    public static void main(String args[]){
        int x = 2147483648l;
        System.out.println(x);
    }
}
ANS : java: incompatible types: possible lossy conversion from long to int
----------------------------------------------------
Ex3 :
public class IntType {
    public static void main(String args[]){
        int x = true;
        System.out.println(x);
    }
}
ANS :java: incompatible types: boolean cannot be converted to int






 */