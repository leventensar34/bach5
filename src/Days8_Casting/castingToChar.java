package Days8_Casting;

public class castingToChar {

    public static void main(String[] args) {

        char ch = 'c';
        int sayi = 88;
        ch = (char) sayi; // Explicit

        System.out.println("char degeri = " + ch);

        int num2 = ch; // implicit
        System.out.println("num2 = " + num2);

        /// boolean can not be converted any data type

    }


}
