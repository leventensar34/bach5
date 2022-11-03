package Days16_ForLoops;

import java.util.Scanner;

public class ForLoops3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String ad = "";
        int tekrarSayisi;
        System.out.println("Lutfen adinizi giriniz: ");
        ad = scan.nextLine();

        System.out.println("Kac defa yazayim: ");
        tekrarSayisi = scan.nextInt();

        for (int i = 1; i <= tekrarSayisi; i++) {
            System.out.println(ad);
            System.out.println(i + "-" + ad);
        }

    }
}
