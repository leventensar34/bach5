package Replit;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {

        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;
        int count1, count2, count3;
        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        while (sayac < 3) {
            System.out.println("Enter Item1, count and its price: ");
            item1 = scan.nextLine();
            count1 = scan.nextInt();
            price1 = scan.nextDouble();
            if (count1 > 0) {
                totalPrice = count1 * price1;
                System.out.println("Item1 is "+item1+" count is "+ count1+ " , price is "+ price1);
            } else {
                System.out.println("Item1 " + item1 + " is not included since its count is 0)");
            }
            sayac++;
        }

    }
}
