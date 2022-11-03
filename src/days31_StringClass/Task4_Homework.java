package days31_StringClass;

public class Task4_Homework {

    public static void main(String[] args) {

        // Write a program to print only vowel (a,e,o,i,u) in given string
        // String word = “Hello World";
        // Output: e,o,o

        String word = "Hello World";

        for (int i = 0; i <= word.length() - 1; i++) {

            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'o' || word.charAt(i) == 'i' || word.charAt(i) == 'u') {
                System.out.print(word.charAt(i) + ",");
            }

        }

    }
}
