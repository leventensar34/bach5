package days33_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AlisVerisSepeti {

    public static void main(String[] args) {

        System.out.println("Alisveris sepeti...");

        String[] sepet = new String[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Sepete ekleyeceginiz urunleri giriniz...");

        for (int i = 0; i < sepet.length; i++) {
            System.out.println((i + 1) + ". urun: ");
            sepet[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(sepet));

        for (int i = 0; i < sepet.length; i++) {
            System.out.println("Sepetteki " + (i + 1) + ". urun = " + sepet[i]);

        }
    }
}
