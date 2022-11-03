package days36;

public class String_CharAt {

    public static void main(String[] args) {


        String word = "Computer";

        System.out.println(word.length());

        System.out.println(word.charAt(0));

        System.out.println(word.charAt(1));

        System.out.println(word.charAt(2));

        System.out.println(word.charAt(3));

        System.out.println(word.charAt(4));

        System.out.println(word.charAt(5));

        System.out.println(word.charAt(6));

        System.out.println(word.charAt(7));


        String word2 = "Apple";

        System.out.println(word2.charAt(0));

        if (word2.charAt(0) == 'A') {
            System.out.println("'A' ilk karakterdir");
        } else {
            System.out.println("'A' ilk karakter degildir");
        }

        String word3 = "civic";

        if (word3.charAt(0) == word3.charAt(4)) {
            System.out.println("Ilk ve son karakterler aynidir");
        } else {
            System.out.println("Ilk ve son karakterler ayni degildir");
        }

        String word4 = "javascript";

        int sonIndex = word4.length() - 1;

        char sonKarakter = word4.charAt(sonIndex);

        System.out.println(word4 + " stringin son karakteri " + sonKarakter + " dir");

        char sonKarakter2 = word4.charAt(word4.length() - 1);

        System.out.println(word4 + " stringin son karakteri " + sonKarakter2 + " dir");

    }
}
