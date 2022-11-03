package Days14_SwitchCase;

import java.util.Scanner;

public class SwitchCaseHesapMakinesi {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int sayi1, sayi2, sonuc;
        System.out.print("Birinci sayi giriniz: ");
        sayi1 = scan.nextInt();

        System.out.print("Bir islem giriniz: ");
        char islem = scan.next().charAt(0);

        System.out.print("Ikinci sayiyi giriniz");
        sayi2 = scan.nextInt();

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                System.out.println("islem sonucu: " + sonuc);
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                System.out.println("islem sonucu: " + sonuc);
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                System.out.println("islem sonucu: " + sonuc);
                break;
            case '/':
                if (sayi2 == 0) {
                    System.out.println(" 0 bolumunden tanimsizdir");
                    break;
                }
                sonuc = sayi1 / sayi2;
                System.out.println("islem sonucu: " + sonuc);
                break;
            default:
                System.out.println("Hatali islem yaptiniz");

        }

    }

}
