package days69_Tasks;

import java.util.ArrayList;

public class Task1 {

      /*
      // ORIGINAL = 3,6,7,8,9,12,15,17,359
        Task 1
     Implement a solution to square each integer in the collection named ORIGINAL
     and output to the console a comma separated list of the processed values
      Expected output : 9,36,49,64,81,144,225,289,128881
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int startNumber = 1;
        int endNumber = 10000;
        System.out.println("Perfect Numbers between " + startNumber + " and " + endNumber);
        for (int i = startNumber; i <= endNumber; i++) {
            int number = i;
            int sqrt = (int) Math.sqrt(number);
            if (sqrt * sqrt == number) {
                list.add(number);
            }
        }
        for (Integer num : list) {
            System.out.print(num + ",");
        }
    }
}


