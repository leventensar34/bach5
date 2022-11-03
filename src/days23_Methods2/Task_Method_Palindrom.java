package days23_Methods2;

import java.util.Scanner;

public class Task_Method_Palindrom {

    public static void main(String[] args) {

        //Klavyeden girilen bir sayıyının palindrom bir sayi olup olmadığını bulan bir metod yazın.

        System.out.println("Ters sayi : "+palindromSayi());


    }

    public static int palindromSayi() {

        Scanner scan = new Scanner(System.in);

        int tersSayi = 0;
        System.out.println("Lutfen bir sayi giriniz: ");
        int orjinalSayi = scan.nextInt();
        int sayi = orjinalSayi;
        while (sayi > 0) {

            tersSayi = tersSayi * 10 + sayi % 10;
            sayi /=10 ;
        }
        if (tersSayi == orjinalSayi) {
            System.out.println("Bu sayi Palindrom bir sayidir");
        } else {
            System.out.println("Bu sayi Palindrom bir sayi degildir");
        }

        return tersSayi;
    }


}

