package Days19_DoWhileLoop;

import java.util.Scanner;

public class Task_CarpimTablosu {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int sayi;
        int i = 1;
        System.out.println("Lutfen bir sayi giriniz: ");
        sayi = scan.nextInt();
        do {
            System.out.println(sayi + " * " + i + " = " + (sayi * i));
            i++;


        } while (i <= 10);

    }
}
