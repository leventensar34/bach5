package Days19_DoWhileLoop;

import java.util.Scanner;

public class DoWhileLoop_ToplamProgrami {

    public static void main(String[] args) {

        int sum = 0;
        int girilensayiSayisi = 0;
        int sayi;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Lutfen bir sayi giriniz: ");
            sayi = scan.nextInt();
            sum += sayi;
            girilensayiSayisi++;
        } while (sayi > 0);
        System.out.println(girilensayiSayisi + " sayinin toplami= " + sum);
    }
}
