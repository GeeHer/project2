package Project2;
/*Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams, meaning they contain
the same characters in a different order. For example, "listen" and "silent" are anagrams.*/

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        // cat act => act
        String s1="Listen";
        String s2="Silent";

        char [] c1= s1.toLowerCase().toCharArray(); //{c,a,t}
        char [] c2=s2.toLowerCase().toCharArray(); //{a,c,t}

        Arrays.sort(c1); // {a,c,t}
        Arrays.sort(c2); // {a,c,t}

        boolean isAnaGram = Arrays.equals(c1,c2);
        System.out.println(isAnaGram);

    }
}
