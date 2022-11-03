package days37;

public class StringStartsWith {

    public static void main(String[] args) {
     // Bir Stringin ne ile basladigini kontrol etmek icin kullanilir.
        String str = "Mr. Brown";

        if (str.startsWith("Mr.")) {
            System.out.println("He is a married man");

        } else if (str.startsWith("Mrs.")) {
            System.out.println("She is a married women");

        } else if (str.startsWith("Ms.")) {
            System.out.println("She is a women");

        } else if (str.startsWith("Dr.")) {
            System.out.println("He/She is a doctor");

        }else {
            System.out.println("Unknown status");
        }
    }
}