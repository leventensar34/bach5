package days37;

public class StringConcat {

    public static void main(String[] args) {

        // concat iki Stringi birlestirmege yarar

        String word = "Hello";
        System.out.println(word);
        System.out.println(word.concat("World"));

        System.out.println(word);

        word = word.concat("World");
        System.out.println(word);

       // word=word.concat(123); Eror
       // word=word.concat("123"); It works


        word=word+123; //String+ing concatanation
        System.out.println(word);

        word=word+true;
        System.out.println(word);

        String word2="Hi";
        word2=word2.concat("-hey").concat("-how are you").concat("-good");

        System.out.println(word2);



    }

}
