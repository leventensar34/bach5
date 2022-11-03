package days62_Exception2;

import java.util.Scanner;

public class Excercise3 {

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");

        try {
            int sayi = Integer.parseInt(klavye.nextLine());
            System.out.println("Sayi : " + sayi);
            int islem = sayi / 1;
            String str = null;
            System.out.println(str.substring(3));

        } catch (NumberFormatException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("0 a bolunme hatasi");
            // e.printStackTrace();
            // System.out.println("e.getMessage() = " + e.getMessage());

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("String degeri null oldugu icin hata olustu ");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Bir Hata olustu");
        }

    }
}
