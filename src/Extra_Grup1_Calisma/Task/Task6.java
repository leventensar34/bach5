package Extra_Grup1_Calisma.Task;

public class Task6 {

    public static void main(String[] args) {


        // Task 6:
//        Given an array of ints length 3, return the sum of all the elements.
//
//        sum3([1, 2, 3]) → 6
//        sum3([5, 11, 2]) → 18
//        sum3([7, 0, 0]) → 7

        int[] numbers1 = {1, 2, 3};

        System.out.println("sum3(numbers) = " + sum3(numbers1));

        int[] numbers2={5,11,2};

        System.out.println("sum3(numbers2) = " + sum3(numbers2));

        int[] number3={7,0,0};

        System.out.println("sum3(number3) = " + sum3(number3));

    }

    public static int sum3(int[] num) {

        int sum = 0;
        for (int i : num) {
            sum += i;

        }
        return sum;
    }
}