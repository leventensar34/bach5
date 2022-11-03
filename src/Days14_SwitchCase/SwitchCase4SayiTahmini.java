package Days14_SwitchCase;

import java.util.Scanner;

public class SwitchCase4SayiTahmini {

    public static void main(String[] args) {

        /// java hafizasinda otomotik sayi tahmini: random

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayi tahmini");
//
//        int randomNum = (int) (Math.random() * 6 + 1);
//        System.out.println("Rastgele sayi...: " + randomNum);

        System.out.println("---------------");
        int randomNum = 0;
        int tahmin;
        int ustSinir = 2;
        randomNum = (int) (Math.random() * ustSinir+1 );
      //  System.out.println("Rastgele sayi...: " + randomNum);

        System.out.println("Tahmininizi giriniz: ");
        tahmin = scanner.nextInt();

        if (randomNum == tahmin) {
            System.out.println("Tebrikler sayiyi bildiniz");
            System.out.println("Tuttugum sayi: " + randomNum);
        } else {
            System.out.println("Malesef sayiyi bilemediniz!!");

        }


    }
}
