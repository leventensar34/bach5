package days33;

import java.util.Scanner;

public class DigitToplama {

    public static void main(String[] args) {


        System.out.println("Rakamlar toplami = " + digitToplama());

    }

    public static int digitToplama() {
        Scanner scan = new Scanner(System.in);
        int number;
        int digit = 0;
        int sumOfDigit = 0;
        System.out.print("Lutfen bir sayi giriniz: ");
        number = scan.nextInt();
        while (number != 0) {
            digit = number % 10;
            sumOfDigit += digit;
            number /= 10;

        }
        while (sumOfDigit < 9) {
            System.out.println("Sayinizin rakamlar toplami = "+sumOfDigit);
            System.out.println("Lutfen daha buyuk sayi giriniz!!");
            System.out.print("Yeniden sayi giriniz: ");
            number = scan.nextInt();
            sumOfDigit = 0;
            while (number != 0) {
                digit = number % 10;
                sumOfDigit += digit;
                number /= 10;
            }

        }
        return sumOfDigit;
    }

}
