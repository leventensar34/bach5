package days33;

import java.util.Scanner;

public class Minutes_Years_Days {

    public static void main(String[] args) {

        yearsDays();
    }

    public static void yearsDays() {
        Scanner scan = new Scanner(System.in);
        double years, days;
        System.out.println("Lutfen dakikayi giriniz: ");

        double minute = scan.nextLong();
        years = minute / 525600;
        days = (minute / 1440) % 365;
        System.out.println(minute + " minutes is approximately " + years + " and " + days + " days");

    }


}
