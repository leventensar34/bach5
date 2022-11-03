package Replit;

import java.util.Scanner;

public class Task22 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("what is the farthest planet in the solar system: a)venus b)pluto c)neptune");
        String input = in.next();

        String quiz1 = "what is the farthest planet in the solar system:\n " +
                "a)venus\n" +
                "b)pluto\n" +
                "c)neptune\n";

        if (input.equals("a")) {
            System.out.println(" a is wrong ");
        } else if (input.equals("b")) {
            System.out.println(" b is correct");
        } else if (input.equals("c")) {
            System.out.println(" c is wrong");
        } else {
            System.out.println(input + " is not a valid answer ");
        }


    }
}

