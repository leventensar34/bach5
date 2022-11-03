package days28_Random_Math_Date;

import java.util.Random;

public class Exercise2 {

    public static void main(String[] args) {

        int num = 0;
        int sum = 0;
        int sayac = 0;

        Random random = new Random();
      num= random.nextInt(8)+1;

        while (true) {
            sayac++;
            sum += num;
            if (sayac == 2 && sum == 8) {
                System.out.println("sum = " + sum);
                break;

            }
        }
        System.out.println("sum = " + sum);

    }
}
