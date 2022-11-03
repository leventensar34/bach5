package days36;

public class occurenceCharacter {
/*
write a program to count the number occurence for specific char String word="abcabacabc"
number of in this stringis:3
 */

    public static void main(String[] args) {

        String word = "abcabqcabc";

        char character = 'a';
        int counter = 0;
        for (int i = 0; i <word.length() ; i++) {

            if (word.charAt(i)==character){
                counter++;
            }
        }
        System.out.println(character+" karakteri "+word+" icerisinde "+ counter+" kez tekrar edilmistir");
    }
}

