package days28_Random_Math_Date;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {


        Random randomNumber = new Random();

        System.out.println("randomNumber.nextInt() = " + randomNumber.nextInt());

        System.out.println("randomNumber.nextDouble() = " + randomNumber.nextDouble());

        System.out.println("randomNumber.nextFloat() = " + randomNumber.nextFloat());

        System.out.println("randomNumber.nextBoolean() = " + randomNumber.nextBoolean());

        System.out.println("randomNumber.nextInt(10) = " + randomNumber.nextInt(10));

        System.out.println(randomNumber.nextInt(10)+5);


        int sayi=randomNumber.nextInt(10)+5;
        System.out.println("sayi = " + sayi);

    }


}
