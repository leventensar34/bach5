package ExtraSelbst1;

import java.util.Scanner;

public class NotOrtalamaHesaplama {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int quiz, vize, ffinal;
        double ortalama;

        System.out.println("Quiz notunu giriniz: ");
        quiz = scan.nextInt();
        System.out.println("Vize notunu giriniz: ");
        vize = scan.nextInt();
        System.out.println("Final notunu giriniz: ");
        ffinal = scan.nextInt();


        ortalama = (quiz * 0.3) + (vize * 0.45) + (ffinal * 0.70);
        System.out.println("ortalama = " + ortalama);
        if (ortalama >= 60) {
            System.out.println("Sinifi  gectiniz");
        } else {
            System.out.println("Malesef sinifi gecemediniz");
        }

    }

}
