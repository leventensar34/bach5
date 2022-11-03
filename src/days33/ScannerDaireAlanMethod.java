package days33;

import java.util.Scanner;

public class ScannerDaireAlanMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double r;
        System.out.println("Lutfen yaricap giriniz: ");
        r = scan.nextDouble();
        System.out.println("Dairenin Alani = " + alan(r));
    }

    public static double alan(double r) {
        double alan, pi = 3.14;
        alan = pi * r * r;

        return alan;
    }

}
