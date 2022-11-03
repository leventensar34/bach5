package ExtraSelbst1;

import java.util.Scanner;

public class WhileFaktoriyel {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Faktoriyel sayisini giriniz: ");
        int f= scan.nextInt();
        int sonuc=1;
        while (f>0){
            sonuc*=f;
            f--;
        }
        System.out.println("sonuc = " + sonuc);

    }
}
