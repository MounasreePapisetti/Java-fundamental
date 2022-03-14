package Fundamentals.DataTypes;

public class ShortType {

    public static void main(String args[]){

             short s='0';
            System.out.println(s);

        }
    }
/* Data Types :
1.In java every variable  and every expression has some type
2.Each and every data type is clearly defined
3.Every assignment should be checked by compiler for type compatibility
because of above reason we can conclude java language is strongly typed programming language

**Java is not considered as pure object orient programming language ,because several oops futures are satisfied by java like (operator overloading ,multiple inheritance extra )
more over we are depending on primitive data types which are non objects
/* Example :class students marks compare to another student is strong ,check there alone is student is weak
Durga marks 2/100
ravi marks 0/100
relative compare to ravi Durga is strong
check Durga alone is checked its weak/fail

same like  compare java with another old programming language it is as pure object orient programming language
check Java alone it is a not pure object orient programming language
several oops  not working,more over depending on primitive data types


                                                             primitive data types (8)

                       numeric data types                                                       Non-numeric data type

  Integral datatype                    Floating point datatype                             char                    boolean

  byte,short,int ,long                     float, double

**.except boolean and char remaining data types consider as "signed data types"  because we can represent both positive and negative numbers
// 2.Short": This is the most rarely used data type in java
//Size :2 bytes(16 bits)
//range :-2^15 to2^15-1 [-32768 to 32767]

//Ex1 : public static void main(String args[]){
         short s=32768;
        System.out.println(s);

    }
}
Ans :java: incompatible types: possible lossy conversion from int to short
 Ex2 : public static void main(String args[]){
         short s=true;
        System.out.println(s);

    }
}
Ans :incompatible types: boolean cannot be converted to short

Note : short data type is the best suitable for 16 bit process like 8085 ,but this processer or completed outdated and hence corresponding shorted data also outdated date type


 */














