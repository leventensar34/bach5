package Replit;

import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {



        limitString();

    }

    public static void limitString() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String word = scan.nextLine();
        System.out.println("Enter a number: ");
        int input = scan.nextInt();
        String limitStr="";
        limitStr=word.substring(0,input);
        System.out.println("limitStr = " + limitStr);
    }

}
