package days28_Random_Math_Date;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("----Pick Number----");

        int pickNumber = (int) (Math.random() * 10 + 1);
        int sayac = 0;
        int guessNumber = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Pleas give a guess number: ");
            guessNumber= scan.nextInt();
            sayac++;
            if (guessNumber == pickNumber) {

                System.out.println("Your number came up after " + sayac + " times.");
            }else {
                System.out.println("Invalid guess");
            }


        }


    }
}
