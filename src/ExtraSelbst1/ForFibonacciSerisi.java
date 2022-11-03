package ExtraSelbst1;

import java.util.Scanner;

public class ForFibonacciSerisi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int input = scan.nextInt();

        int s1 = 0, s2 = 1, sum;
        System.out.println(input + " sayisinin Fibonacci serisi");
        for (int i = 1; i < input; i++) {
            System.out.print(s1 + " , ");
            sum = s1 + s2;
            s1 = s2;
            s2 = sum;
        }
    }
}
