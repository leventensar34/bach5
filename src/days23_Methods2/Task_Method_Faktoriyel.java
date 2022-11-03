package days23_Methods2;

import java.util.Scanner;

public class Task_Method_Faktoriyel {

    public static void main(String[] args) {

        //Klavyeden girilen sayının Faktoriyelini hesaplayan bir metod yazın.

        System.out.println("Girilen sayinin Fktoriyel sonucu : " + faktoriyelSayi());

    }

    public static int faktoriyelSayi() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int result = 1;
        while (sayi > 0) {
            result = result * sayi;
            sayi--;
        }
        return result;
    }


}
