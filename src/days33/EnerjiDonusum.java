package days33;

import java.util.Scanner;

public class EnerjiDonusum {

    public static void main(String[] args) {

        enerjiHesapla();


    }


    public static void enerjiHesapla() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen suyun agirligini giriniz: ");
        double suyunAgirligi = scan.nextDouble();

        System.out.print("Suyun ilk sicakligini giriniz: ");
        double ilkSicaklik = scan.nextDouble();

        System.out.print("Suyun hedeflenen sicakligini giriniz: ");
        double hedefSicaklik = scan.nextDouble();

        double enerjiMiktari = suyunAgirligi * (hedefSicaklik - ilkSicaklik) * 4184;

        System.out.print("Suyu isitmak icin gerekli olan enerji miktari= "+enerjiMiktari);
    }

}
