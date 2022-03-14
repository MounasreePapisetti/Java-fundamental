package Fundamentals.Operators;

public class OperatorsValue {
    public static void main(String args[]){
        int a =200;
        int b =500;
        double d =200.2312323;
        double D2 =a+d;
        System.out.println(D2); //output:400.2312323
        System.out.println("addition :"+a+d);//string concatination output :200200.2312323
        System.out.println("addition :"+(a+d));//output:400.2312323
        char c='a';
        char c1='d';
        char c2 =++c;
        System.out.println(c2); //output : b

        String S1="Mounika ";
        String S2 ="Papisetti";
        String s =S1+S2;
        System.out.println(s); //output :MounikaPapisetti

        /*************Method call and Values assign*****/

        int S0= sub(10,15);
        System.out.println(S0); //output =-5
        int m0=mul(10,20);
        System.out.println(m0);//output =200
         float di0=div(100.22f,20.2f);
        System.out.println(di0);//output :4.961386
        /***********Relational Operators************/
        System.out.println("a is " + a + " , b is " + b);
        System.out.println(a == b);  // false
        System.out.println(a != b);  // true
        System.out.println(a >= b);  // false
        System.out.println(a <= b);  // true
        /********Logical Operators**************/
        System.out.println((a>b)&&(b>a));//false
        System.out.println((a>b)||(b>a));//true
        /******** Assignment Operators**************/
        int z=Assign(100);
        int Assign ;
        Assign =z;
        System.out.println("Assign value =:   "+Assign); //output :100
        Assign +=z;
        System.out.println("Assign value =+:  "+Assign);//output :200
        Assign =+z;
        System.out.println("Assign value =+:  "+Assign);//output :100
    }
    public static int  sub(int a ,int c) {
        return a-c;
    }
    public static int mul(int s ,int o){
       return s*o;
    }
    public static float div(float di1, float di2){
        return  (di1/di2); }

    public static int Assign(int Ass){
        return  (Ass);
    }

}
