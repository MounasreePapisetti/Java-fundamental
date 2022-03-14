package Fundamentals.Operators;

public class AssignmentOp {
    //Assignment operators are used in Java to assign values to variables
    public static void main(String args[]){
        //Create variable
        int z=100;
        int Assign ;
        Assign =z;
        System.out.println("Assign value =:   "+Assign); //output :100
        Assign +=z;
        System.out.println("Assign value =+:  "+Assign);//output :200
        Assign =+z;
        System.out.println("Assign value =+:  "+Assign);//output :100


    }
}
