package days31_StringClass;

import java.util.Scanner;

public class Task2_Lenght {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir String giriniz: ");
        String karakter= scan.nextLine();

        for (int i = 0; i <=karakter.length()-1 ; i++) {
            System.out.println(karakter.charAt(i));
        }
    }
}
