package Extra_Grup1_Calisma.Task;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {


        // Task 3:

        // Scanner kullaniciyi kullanarak ;
        // Kullanici adi=Galatasaray, Parola=1905  olan bir sisteme Login programini yaziniz.
        // Girisler dogru ise "Basarili bir giris yaptiniz." , girislerden herhangi biri yada ikisi yanlis girildi ise
        // "Yanlis bir giris yaptiniz.Lutfen tekrar deneyiniz. Not: Giris sartlari 5 ile sinirlidir.

        Scanner scan = new Scanner(System.in);
        String k_adi, parola;
        for (int i = 0; i < 5; i++) {
            System.out.println("Kullanici adi giriniz: ");
            k_adi = scan.nextLine();
            System.out.println("Parolayi giriniz: ");
            parola = scan.nextLine();
            if (k_adi.equals("Galatasaray") && parola.equals("1905")) {
                System.out.println("Tebrikler " + i + ". denemede basarili bir giris yaptiniz");
            } else {
                System.out.println("Yanlis bir giris yaptiniz.Lutfen tekrar deneyiniz !!");
            }
        }


    }
}
