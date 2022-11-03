package days28_Random_Math_Date;

import java.util.Random;

public class TaskRandomOdd {

    public static void main(String[] args) {

        // surekli tek sayi veren bir donguyu randomla olusturun
        int value;
        Random random = new Random();


        while (true) {
            value = random.nextInt(100 - 50) + 50;

            if (value % 2 != 0) {
                break;
            }
        }
        System.out.println("value = " + value);
    }
}
