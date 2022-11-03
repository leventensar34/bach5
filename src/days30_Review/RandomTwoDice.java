package days30_Review;

import java.util.Random;

public class RandomTwoDice {

    public static void main(String[] args) {

        System.out.println("Two dices sum of 8");
        Random zar1 = new Random();

        int abc = (int)Math.random() * 10;

        int dice1=0;
        int dice2=0;
        int sumofDice;

        sumofDice = dice1 + dice2;
        int counter=0;
        while (sumofDice!=8){
            dice1 = zar1.nextInt(6) + 1;
            dice2 = zar1.nextInt(6) + 1;
            sumofDice = dice1 + dice2;
            System.out.println("dice1 = " + dice1 + " dice2 = " + dice2);
            counter++;
        }
        System.out.println("counter = " + counter);

    }
}
