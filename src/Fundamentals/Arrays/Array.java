package Fundamentals.Arrays;

public class Array {
    public static void main(String[] args) {
        System.out.println(args.length); //command line argument default showing array size has "0"

       int[] x; //name is clearly separated from type
        int[] y;
        int z[];
        // int[6] a; //compiler error at the time of declarations we can't specify the size

        /* 2D array Declarations
        int[][] a;
        int[][] b;
        int c[][];
        int[] d[];
        int[][] e;
        int[] f[];

        int[] a1, b1;
        int[] p[], z1;

        //int[] []a9,[]b9;
    /* If we want to specify the dimension before the variable  it is possible only for the first variable
     if we want to add dimension before the variables it should not allowed--showing compiler time error
      but after the variable if we add dimension it should allow
      */



        int[][][] a3;
        int[][] b3[];
        int[] c3[][];
        int d3[][][];
        int[][][] e3;
        int[][] f3[];
        int[] g3[][];
        int[][] h3[];
        int[][][] i3;


    /* new object we can use to create new objects ,new represented every array called object
    every array in java is an object only ,hence we can create array by using new operator
    int[] a =new int[3]; */


        int[] q1 = new int[3];
        System.out.println(q1.getClass().getName());//default int class name showing as [I
        int[][] r1 = new int[3][2];
        System.out.println(r1.getClass().getName());//here default int class name showing as [[I
        int[][][] r2 = new int[3][2][1];
        System.out.println(r2.getClass().getName());//here default int class name showing as [[[I
        double[] d1 = new double[3];
        System.out.println(d1.getClass().getName());//default boolean class name showing as [D
        short[] s1 = new short[3];
        System.out.println(s1.getClass().getName());//default int class name showing as [S
        byte[] b11 = new byte[3];
        System.out.println(b11.getClass().getName()); //default byte class name showing as [B
        boolean[] bl = new boolean[3];
        System.out.println(bl.getClass().getName()); //default boolean class name showing as [Z
        char[] ch1 = new char[3];
        System.out.println((ch1.getClass().getName()));//default char class name showing as [C
        int[] q21 = new int[0];
        int[] q9 = new int[-3];
        System.out.println(q9.getClass().getName());
        //Exception in thread "main" java.lang.NegativeArraySizeException: -3
        int[] z3 =new int['q'];
        int[] z4 =new int[10]; //Required type: int ,Provided: long
        byte b5 =10;
        int[] z5 =new int[b5];

        int[] z6=new int[2147483647];  //array max range
        //o/p :Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit

        //int[] z7=new int[2147483648];  //Integer number too large
        System.out.println(z6);

    }
}

