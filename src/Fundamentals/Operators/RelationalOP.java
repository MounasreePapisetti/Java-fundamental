package Fundamentals.Operators;

public class RelationalOP {
    //Relational operators are used to check the relationship between two operands
    public static void main(String args[]){

        float a = 7.7f, b = 11.9f;

        System.out.println("a is " + a + " , b is " + b);
        System.out.println(a == b);  // false
        System.out.println(a != b);  // true
        System.out.println(a >= b);  // false
        System.out.println(a <= b);  // true
        System.out.println((a>b)&&(b>a));
        System.out.println((a>b)||(b>a));
    }
}

