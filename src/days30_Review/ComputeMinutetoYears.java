package days30_Review;

import java.util.Scanner;

public class ComputeMinutetoYears {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int minute, year, day;

        System.out.println("Enter the number of minutes...: ");

        minute = scan.nextInt();

        year = (minute / ( 365 * 24 * 60 ));
        day = ((minute - (year * ( 365 * 24 * 60 )))/ (24 * 60));

        System.out.println( minute + " minutes is approximately " + year + " years and "+ day + " days" );

    }
}
