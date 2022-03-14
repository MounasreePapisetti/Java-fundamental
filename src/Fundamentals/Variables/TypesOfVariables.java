package Fundamentals.Variables;

public class TypesOfVariables {
    int x=10;

    public static void main(String[] args) {
        //System.out.println(x);
        //non-static variable x cannot be referenced from a static context
       // TypesOfVariables t =new TypesOfVariables();
        //System.out.println(t.x);
    }
    public void m(){
        System.out.println(x);
    }
}
