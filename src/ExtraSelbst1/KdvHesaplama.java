package ExtraSelbst1;

import java.util.Scanner;

public class KdvHesaplama {

    public static void main(String[] args) {

        double tutar,kdvliTutar,kdv=0.18;

        Scanner input =new Scanner(System.in);

        System.out.println("Urun tutari giriniz: ");
        tutar= input.nextDouble();

        kdvliTutar=tutar+(tutar*kdv);

        System.out.println("kdvliTutar = " + kdvliTutar);
    }
}
