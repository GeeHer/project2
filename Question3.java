package Project2;
/*Check if a String is Palindrome: Determine whether a given string is a palindrome, which means it
reads the same forwards and backward. For example, "madam" is a palindrome.*/

public class Question3 {
    public String palindromeTester(String x) {
        String reversed="";

        for (int i = x.length()-1; i >=0 ; i--) {
            reversed+=x.charAt(i);
        }
        if(x.equals(reversed)){
            return x +" is palindrome";
    } else{
            return x +" is not palindrome";
        }
}
}

class PalindromeTester{
    public static void main(String[] args) {
        Question3 m1= new Question3();
        System.out.println(m1.palindromeTester("madam"));
    }
}

