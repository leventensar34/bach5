package Extra_Grup1_Calisma.Task;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        // Task 1:
//   Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
//  such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
//
//        shareDigit(12, 23) → true
//        shareDigit(12, 43) → false
//        shareDigit(12, 44) → false

        shareDigit();

    }

    public static void shareDigit() {

        Scanner scan = new Scanner(System.in);
        int count = 0, num1, num2, digit1, digit2;
        System.out.println("Enter the numbers between 10...99 ");
        while (count < 5) {
            System.out.println("Enter the first number: ");
            num1 = scan.nextInt();
            System.out.println("Enter the second number: ");
            num2 = scan.nextInt();
            digit1 = num1 % 10;
            digit2 = (num2 - num2 % 10) / 10; //22-->22-22%10-->2=20/10=2
            count++;
            if (digit1 == digit2) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
