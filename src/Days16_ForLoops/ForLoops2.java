package Days16_ForLoops;

import java.util.Scanner;

public class ForLoops2 {
    public static void main(String[] args) {

       /// sayi tahmin oyunu , for dongusu ile
        Scanner scan = new Scanner(System.in);
        int randomNum;
        int ustSinir = 100;
        int tahmin;
        System.out.println("1 ile "+ustSinir+" arasinda sayi tahmin oyunu");
        randomNum = (int) (Math.random() * ustSinir + 1);

        for (int i = 1; i <= 10; i++) {

            System.out.println(i + "." + " Tahmininiz nedir:");
            tahmin = scan.nextInt();

            if (randomNum == tahmin) {
                System.out.println("Tebrikler sayiyi bildiniz");
                System.out.println(i + "-tahminde bildiniz");
                break;
            } else {
                System.out.println("Malesef bilemediniz!!");
                if (tahmin > randomNum) {
                    System.out.println("Tuttugum sayi seninkinden kucuk");
                } else {
                    System.out.println("Tuttugum sayi seninkinden buyuk");
                }
            }


        }


    }
}
