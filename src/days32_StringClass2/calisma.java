package days32_StringClass2;

import java.util.Scanner;

public class calisma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" 1. sayiyi giriniz: ");
        int num1 = scan.nextInt();
        System.out.println("2. sayiyi giriniz: ");
        int num2 = scan.nextByte();
        int sonSayi = 1;
        for (int i = 1; i <=num2 ; i++) {
        sonSayi*=num1;

        }
        System.out.println("sonSayi = " + sonSayi);


//
//        int count = 0;
//        int sonuc = 1;
//        Scanner sayi = new Scanner(System.in);
//
//        System.out.println("Lütfen birinci sayiyi girin :");
//
//        int sayi1 = sayi.nextInt();
//
//        System.out.println("Lütfen ikinci sayiyi girin :");
//
//        int sayi2 = sayi.nextInt();
//
//        while (count <=sayi2){
//
//
//            sonuc *= sayi1;
//
//            count++;
//        }
//
//        System.out.println( "Sonuc ="+ sonuc );
//

    }
}