package days33_Arrays;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner giris=new Scanner(System.in);

        int[] sayi=new int[6];

        int toplam=0;

        for (int i = 0; i <=5 ; i++) {
            sayi[i]= giris.nextInt();

            toplam=toplam+sayi[i];

        }

        System.out.println("Girdiginiz sayilarin toplami: "+toplam);
        System.out.println("Sayui dizisinin 2. elemani: "+ sayi[1]);


    }
}
