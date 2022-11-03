package Replit;

import java.util.Scanner;

public class Task28 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scan.nextLine();
        String newStr = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            newStr += input.charAt(i);

        }
        if (!newStr.equals(input)){
            System.out.println("Entered string isn't a palindrome.");
        }else {
            System.out.println("Entered string is a palindrome.");
        }
    }
}
