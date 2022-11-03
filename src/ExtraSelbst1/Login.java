package ExtraSelbst1;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String k_adi, parola;
        System.out.println("Kullanici adi giriniz: ");
        k_adi = scan.nextLine();
        System.out.println("Parolayi giriniz: ");
        parola = scan.nextLine();
        if (k_adi.equals("selamlar") && parola.equals("98765") ){
            System.out.println("Basarili bir giris yaptiniz");
        } else {
            System.out.println("Yanlis bir giris yaptiniz.Lutfen tekrar deneyiniz !!");
        }
    }
}