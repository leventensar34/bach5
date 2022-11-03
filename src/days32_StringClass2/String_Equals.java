package days32_StringClass2;

public class String_Equals {

    public static void main(String[] args) {

        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = "Hello Moon";

        boolean karsilastirma1 = str1.equals(str2);
        boolean karsilastirma2 = str1.equals(str3);
        System.out.println("karsilastirma = " + karsilastirma1);
        System.out.println("karsilastirma2 = " + karsilastirma2);

        boolean karsilastirma3 = str1 == str2;
        boolean karsilastirma4 = str1 == str3;
        System.out.println("karsilastirma3 = " + karsilastirma3);
        System.out.println("karsilastirma4 = " + karsilastirma4);

        String str4 = new String("Hello World");

        boolean karsilastirma5 = str1.equals(str4);
        boolean karsilastirma6 = str1 == str4;

        System.out.println("karsilastirma5 = " + karsilastirma5);
        System.out.println("karsilastirma6 = " + karsilastirma6);


    }
}
