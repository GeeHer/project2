package Project2;
/*Write a program to swap 2 String without a temporary variable?*/
public class Question1 {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Classes";


        System.out.println("Before swapping = ");
        System.out.println("First string is: "+str1);
        System.out.println("Second string is: "+str2);
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("After swapping =");
        System.out.println("First string is: " +str1);
        System.out.println("Second string is: "+str2);
    }
}
