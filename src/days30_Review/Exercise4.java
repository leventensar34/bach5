package days30_Review;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int second = input.nextInt();

        int minute = second / 60;
        int hour = minute / 60;

        second = second % 60;
        minute = minute % 60;
        hour = hour % 24;

        System.out.println(hour + " hours, " + minute + " minutes, and " + second + " seconds");


    }
}
