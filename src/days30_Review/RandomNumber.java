package days30_Review;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Random rastgeleSayi = new Random();

        System.out.println("rastgeleSayi.nextInt() = " + rastgeleSayi.nextInt(10));
        System.out.println("rastgeleSayi.nextDouble() = " + rastgeleSayi.nextDouble());
        System.out.println("rastgeleSayi.nextBoolean() = " + rastgeleSayi.nextBoolean());

        int low = 50;
        int high = 100;


        for (int i = 0; i < 100; i++) {

            int result = rastgeleSayi.nextInt(high-low) + low;
            if (result % 2 !=0){
                System.out.println(i+ "- result = " + result);
            }


        }

    }
}
