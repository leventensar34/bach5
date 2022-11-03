package days37;

public class StringEquals {

    public static void main(String[] args) {
     // iki String degerin esit olup olmadigini kontrol eder

        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = "Hello Moon";

        boolean b1 = str1.equals(str2);
        boolean b2 = str1.equals(str3);
        System.out.println("str1 ve str2 with equels() " + b1);
        System.out.println("str1 ve str2 with equels() " + b2);

        boolean b3 = str1 == str2;
        boolean b4=str1==str3;

        System.out.println("str1 ve str2 with == " + b3);
        System.out.println("str1 ve str3 with == " + b4);


        String str4=new String("Hello World");

        boolean b5=str1.equals(str4);
        boolean b6=str1.equals(str4);

        System.out.println("str1 ve str2 with equals() " + b5);
        System.out.println("str1 ve str4 with == " + b6);


    }
}
