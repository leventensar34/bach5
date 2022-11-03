package Days14_SwitchCase;

import java.util.Scanner;

public class SwitchCase1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi;
        sayi= scan.nextInt();
        switch (sayi){
            case 5:
                System.out.println("Sayi 5 tir");
                break;
            case 6:
                System.out.println("sayi 6 dir");
                break;
            default:
                System.out.println("sayi 5 ve 6 nin disindadir");
        }
    }
}
