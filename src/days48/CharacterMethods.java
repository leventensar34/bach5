package days48;

public class CharacterMethods {

    public static void main(String[] args) {

        System.out.println(Character.isAlphabetic('a'));
        System.out.println(Character.isAlphabetic('5'));

        System.out.println(Character.isLetter('H'));
        System.out.println(Character.isLetter('$'));

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('*'));

        String word="Java2022";

        System.out.println(Character.isAlphabetic(word.charAt(3)));
        System.out.println(Character.isAlphabetic(word.charAt(5)));
        System.out.println(Character.isDigit(word.charAt(7)));


    }
}
