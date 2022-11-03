package Replit;

import java.util.Scanner;

public class Task17Normal {

    public static void main(String[] args) {


        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;
        int count1, count2, count3;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        item1 = scan.nextLine();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.nextLine();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter Item3, count and its price:");
        item3 = scan.nextLine();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();


        if (count1 > 0) {
            System.out.println("Item1 is \"Tomatoes\", count is " + count1 + " , price is " + price1);
        } else if (count2 > 0) {
            System.out.println("Item1 is \"Cheese\", count is " + count2 + " , price is " + price2);
        } else if (count3 > 0) {
            System.out.println("Item1 is \"Apples\", count is " + count3 + " , price is " + price3);
        } else {
            System.out.println("You entered false Item");
        }


        totalPrice = (price1 * count1) + (price2 * count2) + (price3 * count3);
        System.out.println("Item1: Tomatoes Price: " + (price1 * count1) + ", Item3: Apples Price: " + (price3 * count3));

        System.out.println("Total price: " + totalPrice);
    }
}











