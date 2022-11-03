package ExtraSelbst1;

import java.util.Scanner;

public class SinifAtlama {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int turkce, matematik, fenBilgisi, muzik, resim;
        double ortalama;

        System.out.println("Lutfen Turkce notunu giriniz: ");
        turkce = scan.nextInt();
        System.out.println("Lutfen Matematik notunu giriniz: ");
        matematik = scan.nextInt();
        System.out.println("Lutfen Fen Bilgisi notunu giriniz: ");
        fenBilgisi = scan.nextInt();
        System.out.println("Lutfen Muzik notunu giriniz: ");
        muzik = scan.nextInt();
        System.out.println("Lutfen Resim notunu giriniz: ");
        resim = scan.nextInt();

        ortalama = (turkce + matematik + fenBilgisi + muzik + resim) / 5;
        System.out.println("ortalama = " + ortalama);

        if (ortalama>=50){
            System.out.println("Tebrikler sinifi gectiniz ");
        }else{
            System.out.println("Uzgunuz sinifi gecemediniz ");
        }

    }
}
