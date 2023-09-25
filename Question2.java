package Project2;
/*Reverse a String: Write a function to reverse a given string. For example, given the input
"Hello", the output should be "olleH".*/

public class Question2 {
    public static void main(String[] args) {
        String str="Hello";
        String strReversed="";

        for (int i = str.length()-1; i>=0; i--) {
            strReversed+=str.charAt(i);
        }
        System.out.println(strReversed);
    }
}
