package days31_StringClass;

public class Task3_Homework {

    public static void main(String[] args) {

        // Write a program to count the number of occurrences for specific char
        // String word = “Abcdaorwakocoeeca”
        // Number of ‘a’ in this string is: 3

        String word = "Abcdaorwakocoeeca";

        char karakter = 'a';
        int sayac = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == karakter) {
                sayac++;
            }
        }
        System.out.println("Number of " + karakter + " in this string is: " + sayac);

    }
}
