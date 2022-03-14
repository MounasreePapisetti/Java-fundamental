package Fundamentals.Arrays;

public class Array4Case1 {
    public static void main(String[] args) {


    /* Array variable assignments
    case1 : element level promotions are not applicable for array level
    char element can be promoted to int type whereas char array can't be promoted to int array
     */
        int[] x = {10, 20, 30, 40};
        int[] z = x;

        System.out.println(z);
        System.out.println(z[0]);
        System.out.println(x[1]);
        System.out.println(z[2]);
        System.out.println(z[3]);
        System.out.println(z[5]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
        // at Fundamentals.Arrays.ArrayClass4.main(ArrayClass4.java:17)

        char[] ch = {'a', 'b', 'c', 'd' };


    }}
    // double d=x;// incompatible types: double[] cannot be converted to int[]
//float f=x;// incompatible types: float[] cannot be converted to int[]


     // int[] i =ch; // incompatible types: char[] cannot be converted to int[]
       /* System.out.println(i[0]);
        System.out.println(ch[1]);
        System.out.println(i);*/

/*which of the following promotions  performed automatically

        char ->int---valid
        char[] ->int[] ---in valid
        int ->double  -- valid
        int[] ->double[] --in valid
        float ->int   --in valid
        float[] ->int[] --in valid
        string ->Object  --valid
        String[] ->Object[] --valid
        1.but in the case of object type arrays ,child class type  array can be promoted to parent class type array
       String [] s ={"A" ,"B","C"}
       Object[] a =s;
 */




