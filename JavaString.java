/* Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on.

Any characters left, will go to the end of the result.
Example1:

i/p:Hello World
 o/p:Hieolrllod
 */
 import java.lang.*;
import java.util.Scanner;
class MergeTwoString {

 static String  Solution(String a , String b){
     String big = a.length() > b.length() ? a : b;
     String small = a.length() > b.length() ? b : a;
   
String temp ="";
int i =0;
while( i < small.length()){
  temp += (a.charAt(i));
  temp += (b.charAt(i));
i++;
}
   temp += (big.substring(small.length()));
    return temp;
}

    public static void main(String[] args) {
        System.out.println("Enter 2 String");
        Scanner s = new Scanner(System.in);
       String i1 =  s.next();
       String i2= s.next();
       String ans =  Solution(i1,i2);
       System.out.println("The Solution Is :  "+ ans);
    }
}
