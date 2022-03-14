package Fundamentals.Reservedwords;

public class ReservedWords {
}

/*2.Reserved words  (53 ):in java some words are reserved to represent  the meaning or functionality such type of words are called reserved words
ex:cat,dog ,apple

                                                               Reserved words (53)

                             keywords(50)                                                               reserved literals (3)

       used keywords(48)                        unused keywords(2)                                       true ,false ,null

       if,else.......                           goto ,const


keywords for data types (8)
 byte
 short
 int
 long
 float
 double
 boolean
 char
keywords for flow control (11)
 if
 else
 switch
 case
 default
 while
 do
 for
 break
 continue
 return
keywords for modifiers(11)
  public
  private
  protect
  static
  final
  abstract
  synchronized
  native
  strictfp (1.2 version its came)
  transient
  volatile
keywords for exception handling (6)
  try
  catch
  finally
  throw
  throws
  Assert (1.4 version)
class related keywords (6)
  class
  interface
  extends
  implements
  package
  import
object related keywords (4)
 new
 instanceof
 super
 this
void return type keyword
//in java return type is mandatory if a method won't return anything then we have declare that  method with void return type
but in c language  return type is officinal default return type is int

unused keywords

goto : usage of goto created a several problems in old languages and hence sun people band this keyword in java
const :use final instead of const

NOte :goto and const are unused keywords and if we are trying to use we will get compile time error

reserved literals :
true /false : used for boolean data types
null : default used for object reference

enum keyword (1.5 version)
 we can use enum to define a group of named constants

EX 1:enum month {
jan ,feb......dec ;
}
ex2 : enum beer{
kf,ko......;
}


Conclusions :

1.All 53 reserved words in java in contains only lower case alphabet symbols
2.in Java we have only new keyword and there is Delete keyword  because distraction of useless object is the responsibility of garbage collection
3.the following are new keywords in java
3.1  strictfp (1.2 version its came)
3.2  Assert (1.4 version)
3.3  enum keyword (1.5 version)

4. strictfp but not strictFp
   instanceof but not  instanceOf
   implements but not implement
   synchronized but not synchronize
   import but not imports
   extends but not extend
   const but not constant

QA 1: which of the following list contains only java reserved words
   new , delete  --delete is not
   goto ,constant  --constant is not
   break,continue ,return ,exit -- exit is not
   final ,finally,finalize -- finalize is not
   throw,throws,thrown, --thrown is not
   notify,notifyAll  --both are methods
   implements,extends,imports --imports is not
   sizeof,instanceof  --sizeof is not
   instanceOf,strictFp -- both have capital (O ,F)
   byte,short,Int --- Int is not
   None of the above
ANS : None of the above
QA2 :  which are the following are java reserved words
    public
    static
    void
    String --String is just predefined class not a reserved word
    main  --name of the method not reserved word
    args -- its is a variable
ANS :public , static , void
 */

