package Replit;

import java.util.Scanner;

public class Task27 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scan.next();

        System.out.println(uniqueChars(scan.next()));

    }

    public static String uniqueChars(String str) {

        int count = 0;
        String newStr = "";

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1 || count == 0 || count == 2) {
                newStr += str.charAt(i);
            }
            count=0;
        }
        return newStr;
    }


}
