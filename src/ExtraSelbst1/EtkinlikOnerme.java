package ExtraSelbst1;

import java.util.Scanner;

public class EtkinlikOnerme {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sicaklik;
        System.out.print("Sicaklik giriniz: ");
        sicaklik = scan.nextInt();

        if (sicaklik > 30) {
            System.out.println("Yuzmeye gidilebilir ");
        } else if (sicaklik >= 5 && sicaklik <= 30) {
            System.out.println("Sinemaya gidilebilir ");
        } else {
            System.out.println("Kayak yapmaya gidilebilir ");
        }
    }
}
