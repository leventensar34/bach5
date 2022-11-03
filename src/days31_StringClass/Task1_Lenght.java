package days31_StringClass;

import java.util.Scanner;

public class Task1_Lenght {

    public static void main(String[] args) {

        // write a program that asks to enter his/her firstname und lastname.

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen ad ve soyad giriniz: ");

        String adsoyad=input.nextLine();

        int adSoyadLenght=adsoyad.length();

        System.out.println("adSoyadLenght = " + adSoyadLenght);

    }
}
