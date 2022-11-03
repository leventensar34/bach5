package days62_Exception2;

import java.util.InputMismatchException;

public class MyCustExpTest {

    static void yasKontrol(int yas) throws MyCustomException, InputMismatchException { //throws ing deki cogul firlatma olarak dusun

        if (yas < 18) {
            throw new MyCustomException("Oy verme yasi 18 den kucuk olamaz!");
        } else {
            System.out.println("Tebrikler. Oy kullanabilirsiniz");
        }
    }

    public static void main(String[] args) {


        try {
            yasKontrol(18);
        } catch (MyCustomException e) {
            e.printStackTrace();
        }
    }
}
