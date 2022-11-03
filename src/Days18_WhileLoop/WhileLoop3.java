package Days18_WhileLoop;

import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        while (sayi > 0) {
            System.out.println("Sayi" + sayi);
            sayi--;

        }
    }
}
