package ExtraSelbst1;

import java.util.Scanner;

public class UcakBiletHesaplama {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int km, yas, tipi;
        System.out.println("Km giriniz: ");
        km = scan.nextInt();
        System.out.println("Yasi giriniz: ");
        yas = scan.nextInt();
        System.out.println("Seyahat bicimini seciniz: \n(1-Gidis \n2-Gidis-Donus)");
        tipi = scan.nextInt();

        double normalFiyat, yasIndirimi, tipiFiyati;

        if (km > 0 && yas > 0 && (tipi == 1 || tipi == 2)) {
            normalFiyat = km * 0.10;
            if (yas < 12) {
                yasIndirimi = normalFiyat * 0.50;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = normalFiyat * 0.10;
            } else if (yas > 65) {
                yasIndirimi = normalFiyat *0.30;
            } else {
                yasIndirimi = 0;

            }
            normalFiyat -= yasIndirimi;
            if (tipi == 2) {
                tipiFiyati = normalFiyat * 0.20;
                normalFiyat=(normalFiyat-tipiFiyati)*2;
        }
            System.out.println("Bilet tutari: "+normalFiyat+"$");

        }else{
            System.out.println("Girdiginiz degerler eksik.Lutfen tekrar kontrol ediniz!!");
        }

    }
}
