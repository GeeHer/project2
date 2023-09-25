package Project2;
/*Count the Number of Words in a String: Write a function to count the number of words in a given string.
Words are separated by spaces or punctuation. For example, the input "Hello, world!" should return 2.*/

public class Question4 {

    public int wordsInAString(String x){
        String [] strArray=x.split("\\s | \\p{Punct}");
        

        return strArray.length;
    }
}

class SplitTester{
    public static void main(String[] args) {
        Question4 m1= new Question4();
        System.out.println(m1.wordsInAString("Hello, world! "));
    }
}
