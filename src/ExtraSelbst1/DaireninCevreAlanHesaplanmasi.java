package ExtraSelbst1;

import java.util.Scanner;

public class DaireninCevreAlanHesaplanmasi {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double r,cevre,alan,pi=3.14;
        System.out.println("Dairenin yaricapini giriniz : ");
        r= input.nextInt();
        cevre=2*pi*r;
        alan=pi*(r*r);
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
