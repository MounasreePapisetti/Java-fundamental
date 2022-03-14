package Fundamentals.DataTypes;

public class chartype {
    public static void main(String[] args) {
        char ch ='a';
        System.out.println(ch);
    }
}
/* char data type :old languages (C,C++) are ASCII code based and the number of  allowed difference ASCII code characters are <=256
represent this 256 characters 8 bits (1 byte) are enf
hence the size of char in old language is 1 byte
ASCII numbers  --a to z,A to Z,0 to 9 ,special characters............
X ->2 (0,1)
XX -> 4 (00,11,01,10)
XXX -> 8 (000,111 ,101,100,010,001 ,110 ,011)
XXXX ->16 (0000 ,1111.........)
XXXXX -> 32
X*5  -->64
x*6 -->128
x*7 ---> 256

but java is Unicode based  and the number of Unicode characters >256 and less than are equal to<=65536
 To represent this may characters 8 bits may not enf ,compalasory we should go for 16 bits. hence, the size of char in java is 2 bytes
(its include all ASCII characters and any language vowels (telugu ,english ,hindi ,chinese....)

 Size :2 bytes
 Range :0 to 65535

 */