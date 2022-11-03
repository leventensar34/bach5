package Extra_Grup1_Calisma.Task;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        // Task 8:

//        Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
//        Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
//
//        lastDigit(7, 17) → true
//        lastDigit(6, 17) → false
//        lastDigit(3, 113) → true

        System.out.println(lastDigit());

    }

    public static boolean lastDigit() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();

        if (num1 % 10 == num2 % 10) {
            return true;
        } else {
            return false;
        }


    }


}
