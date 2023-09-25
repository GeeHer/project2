package Project2;
/*You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case*/
public class Question7 {
    public static void main(String[] args) {
        String [] words = {"Animals","Dog","Birds","Carrots","Apple","Sugar"};

        for (int i = 0; i < words.length; i++) {
            if(words[i].toLowerCase().startsWith("a")){
                System.out.println(words[i].toLowerCase());
            }
        }
    }
}
