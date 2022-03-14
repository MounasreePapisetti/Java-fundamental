package Fundamentals.JavaCodeStandards;

public class TestClass {
    public static void main(String[] args) {
        JavaCodeStandards jcs =new JavaCodeStandards();//object create

        JavaCodeStandards jc =new JavaCodeStandards();

       jcs.setName("Mouni Hello");
       jcs.setName("Welcome");
       jc.setName("tt");
        String S =jcs.getName();
        String S1 =jc.getName();
        System.out.println("jcs.value:"+S);
        System.out.println("jcs.value:"+S1);
    }
}
