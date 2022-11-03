package days33;

import java.util.Scanner;

public class SayiTahminExercise5 {
    public static void main(String[] args) {

     tahminiSayiBulma();
    }

    public static void tahminiSayiBulma() {

        Scanner scanner = new Scanner(System.in);
        int tutulanSayi = 20;
        int tahmin;
        int ustSinir = 30;

        System.out.println("1 ile " + ustSinir + " arasi Sayi tahmini oyunu ");
        System.out.println("---------------");


        for (int i = 1; i <ustSinir; i++) {
            System.out.print("Tahmininizi giriniz: ");
            tahmin = scanner.nextInt();

            if (tutulanSayi == tahmin) {
                System.out.println("Tebrikler sayiyi bildiniz");
                System.out.println("Tuttugum sayi: " + tutulanSayi);
                System.out.println(i + ". denemede bildiniz");
                break;

            } else {
                System.out.println("Malesef sayiyi bilemediniz!!");

                if (tahmin > tutulanSayi) {
                    System.out.println("Daha buyuk bir sayi tahmini yaptiniz");
                } else {
                    System.out.println("Daha kucuk bir sayi tahmini yaptiniz");
                }
            }

        }

    }

}
