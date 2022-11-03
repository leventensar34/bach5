package Days16_ForLoops;

import java.util.Scanner;

public class ForFibonacciSayiBulma {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int fiboSayi = scan.nextInt();

        int s1 = 0, s2 = 1, sum;
        System.out.println(fiboSayi + " sayisinin Fibonacci serisi");
        for (int i = 1; i < fiboSayi; i++) {
            System.out.print(s1 + " , ");
            sum = s1 + s2;
            s1 = s2;
            s2 = sum;


        }

    }
}



