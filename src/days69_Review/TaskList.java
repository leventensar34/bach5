package days69_Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskList {


    public static void main(String[] args) {

        /*
        // ORIGINAL = 3,6,7,8,9,12,15,17,359
    Task 1
    Implement a solution to square each integer in the collection named ORIGINAL
    and output to the console a comma separated list of the processed values
    Expected output : 9,36,49,64,81,144,225,289,128881

         */
        List<Integer> original = Arrays.asList(3, 6, 7, 8, 9, 12, 15, 17, 359);

        task3(original);
    }

    public static void task1(ArrayList<Integer> original) {
        for (int i = 0; i < original.size(); i++) {
            System.out.println(original.get(i) * original.get(i));
            if (i != original.size() - 1) {
                System.out.println(",");
            }

        }
    }

    public static void task3(List<Integer> original) {
        int sum = 0;
        for (int i = 0; i < original.size(); i++) {
            sum += original.get(i);
            System.out.println(sum);
            if (i != original.size() - 1) {
                System.out.println(",");
            }
        }
    }
}
