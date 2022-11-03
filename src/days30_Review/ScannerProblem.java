package days30_Review;

import java.util.Scanner;

public class ScannerProblem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Yaşınızı giriniz..: ");

        int yas = input.nextInt();
        input.nextLine();

        System.out.print("Lütfen adınızı giriniz..: ");
        String ad = input.nextLine();

        System.out.println("yasınız = " + yas);
        System.out.println("adınız = " + ad);

    }
}
