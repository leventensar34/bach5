package days37;

public class StringTrim {

    public static void main(String[] args) {

        String str="  Hello World  ";

        System.out.println(str);

        System.out.println(str.trim());

        System.out.println(str);


        String str2="    Hello     World    ";
        System.out.println(str2.trim());
        System.out.println(str2.replace(" ", ""));

    }
}
