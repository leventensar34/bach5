package Replit;

import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String word = scan.next();

        if (word.length() % 2 != 0) {
            System.out.println(word.charAt((word.length() - 1) / 2));
        } else if (word.length() == 1) {
            System.out.println(word+word+word);
        }
        if (word.length() % 2 == 0) {
            if (word.length() >= 4) {
                char harf1 = word.charAt(word.length() / 2);
                char harf2 = word.charAt(word.length() / 2 + 1);
                System.out.println(word.charAt(harf1) + word.charAt(harf2));
            } else if (word.length() == 2) {
                System.out.println(word+word);
            }
        }

    }
}

