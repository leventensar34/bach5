package days36;

import java.util.Scanner;

public class PrintLengthName {

    public static void main(String[] args) {

        Scanner name=new Scanner(System.in);

        System.out.println("Lutfen adinizi ve soyadinizi giriniz: ");

        String adSoyad= name.nextLine();

        int Uzunluk=adSoyad.length();

        System.out.println("Ad-soyad uzunlugu:"+Uzunluk);

    }
}
