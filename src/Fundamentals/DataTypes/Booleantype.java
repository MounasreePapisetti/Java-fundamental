/*package Fundamentals.DataTypes;



public class Booleantype {
    public static void main(String[] args) {
        while (10) {
            System.out.println("Hi");
        }
    }
}*/
/* size not applicable [verchiel machine dependent]
Range Not applicable [But allowed values are true or false]

ex1 :public class Booleantype {
    public static void main(String[] args) {
        boolean b = true;
        System.out.println(b);
    }
}
ANS :true
------------------------
Ex2 :
public class Booleantype {
 public static void main(String[] args) {
        boolean b = True;
        System.out.println(b);
    }
}
ANS :java: cannot find symbol
  symbol:   variable True
  location: class Fundamentals.DataTypes.Boolean type

 -------------------------------
Ex3 :
public class Booleantype {
 public static void main(String[] args) {
        boolean b = 10;
        System.out.println(b);
    }
}
ANS :java: incompatible types: int cannot be converted to boolean
------------------------------------
Ex 4 :
public class Booleantype {
 public static void main(String[] args) {
        boolean b = "True"";
        System.out.println(b);
    }
}
ANS :java: incompatible types: java.lang.String cannot be converted to boolean
--------------------
Ex 5 :
public class Booleantype {
 public static void main(String[] args) {
        boolean b = 0;
        System.out.println(b);
    }
}
ANS :java: incompatible types: int cannot be converted to boolean
-----------------------------
Ex 6:
public class Booleantype {
    public static void main(String[] args) {
        int x = 0;
        if (x) {
            System.out.println("Hello");
        } else {
            System.out.println("Hi");
        }
    }
}
ANS :java: incompatible types: int cannot be converted to boolean
---------------------------------
Ex 7 :
public class Booleantype {
    public static void main(String[] args) {
        while (1) {
            System.out.println("Hi");
        }
    }
}
ANS : java: incompatible types: int cannot be converted to boolean

Ex6, 7 examples will work in c
 */