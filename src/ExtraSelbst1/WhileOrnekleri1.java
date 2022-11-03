package ExtraSelbst1;

import java.util.Scanner;

public class WhileOrnekleri1 {

    public static void main(String[] args) {

        /// task 1: 1 den 100 kadar cift sayilari yazdirin
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println("---------------");
        ///// task 2:

        Scanner scan = new Scanner(System.in);

        int num;
        int sum = 0;
        System.out.println("Lutfen bir sayi giriniz: ");
        num = scan.nextInt();

        while (true) {

            if (num < 0) {
                System.out.print("Program bitti.Negatif bir sayi girdiniz ");
                break;
            }
            if (num % 2 == 1) {
                sum += num;

            }
            num++;
        }
        System.out.println("Girilen tek sayilarin toplami : " + sum);

    }

}
