package Days16_ForLoops;

import java.util.Scanner;

public class FaktoriyelSayi {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen faktoriyel sayiyi giriniz: ");
        int f= scan.nextInt();
        int sonuc=1;
        for (int i =f; i >=1; i--) {
            sonuc*=f;
            f--;
        }
        System.out.println("sonuc = " + sonuc);
    }
}
