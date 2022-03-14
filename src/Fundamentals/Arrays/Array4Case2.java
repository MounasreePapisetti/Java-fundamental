package Fundamentals.Arrays;

public class Array4Case2 {
    /* when ever e assign one array to another array internals elements would not be copy ,just reference elements are reassigned
    */
    public static void main(String[] args) {
        int[] a ={10,20,30,40,50};
        int[] b ={60,70};
      //  a=b;
        b=a;

        int [] s =new int[10];

        System.out.println(b);
        System.out.println(a);
        System.out.println("a[0] "+ a[0]);
        System.out.println("b[0] "+b[0]);
        System.out.println("a[1] "+a[1]);
        System.out.println("b[1] "+b[1]);
        System.out.println(a[2]);//Index 2 out of bounds for length 2
        System.out.println(b[2]);//Index 2 out of bounds for length 2
    }
}
