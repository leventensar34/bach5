package Extra_Grup1_Calisma.Task;

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {


        // Task 7:

//        Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
//        The original array will be length 1 or more.
//
//        makeEnds([1, 2, 3]) → [1, 3]
//        makeEnds([1, 2, 3, 4]) → [1, 4]
//        makeEnds([7, 4, 6, 2]) → [7, 2]

        int[] numbers1 = {1, 2, 3};

        int[] numbers2={1,2,3,4};

        int[] numbers3={7,4,6,2};

        System.out.println("Arrays.toString(makeEnds(numbers1)) = " + Arrays.toString(makeEnds(numbers1)));
        System.out.println("Arrays.toString(makeEnds(numbers2)) = " + Arrays.toString(makeEnds(numbers2)));
        System.out.println("Arrays.toString(makeEnds(numbers3)) = " + Arrays.toString(makeEnds(numbers3)));

        System.out.println(Arrays.toString(makeEnds(numbers2)));
    }

    public static int[] makeEnds(int[] a) {

        int[] newArray = new int[2];

        newArray[0]=a[0];
        newArray[1]=a[a.length-1];
        return newArray;
    }

}
