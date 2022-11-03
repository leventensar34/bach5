package days31_StringClass;

public class StringCharAt {

    public static void main(String[] args) {

        String word = "Computer";

        System.out.println("word.length() = " + word.length());
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(5));
        System.out.println(word.charAt(6));
        System.out.println(word.charAt(7));

      //  System.out.println(word.charAt(8));

        System.out.println("word.charAt(word.length()-1) = " + word.charAt(word.length() - 1));

       if (word.charAt(0)=='C'){

           System.out.println("Ilk karakter dogrudur");
       }else {
           System.out.println("Ilk karakter yanlistir");
       }
    }
}
