package Days18_WhileLoop;

import java.util.Scanner;

public class WhileLoop_ToplamaProgrami {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int araToplamSayisi=1;

        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi= scan.nextInt();
        while (sayi>0){
            toplam+=sayi;
            if (araToplamSayisi%5==0){
                System.out.println("Ara toplam= "+toplam);
            }
            System.out.print("Lutfen bir sayi giriniz: ");
            sayi= scan.nextInt();
            araToplamSayisi++;
        }
        System.out.println("toplam = " + toplam);
    }
}
