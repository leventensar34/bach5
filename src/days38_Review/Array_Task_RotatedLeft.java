package days38_Review;

import java.util.Arrays;

public class Array_Task_RotatedLeft {

    public static void main(String[] args) {

        int[] x = {1, 2, 3};

        System.out.println(Arrays.toString(rotateLeft(x)));


        int[] y={17,12,10,8};

        System.out.println(Arrays.toString(rotateLeft(y)));


    }


    public static int[] rotateLeft(int[] arr) {

        int x = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {

            arr[i] = arr[i + 1];

        }
        arr[arr.length - 1] = x;

        return arr;
    }
}
