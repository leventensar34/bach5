package days29_UserInput;

import java.util.Scanner;

public class ComputerAreWithConsoleInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double pi = 3.14159;

        System.out.println("Enter a number for radius: ");

        double radius = input.nextDouble();

        System.out.println("radius = " + radius);

        double area = radius * radius * pi;
        System.out.println("Area of Circle = " + area);


    }
}
