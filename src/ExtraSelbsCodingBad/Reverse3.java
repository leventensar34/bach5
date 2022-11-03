package ExtraSelbsCodingBad;

import java.util.Arrays;

public class Reverse3 {

    public static void main(String[] args) {
//
//        Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
//
//        reverse3([1, 2, 3]) → [3, 2, 1]
//        reverse3([5, 11, 9]) → [9, 11, 5]
//        reverse3([7, 0, 0]) → [0, 0, 7]

        int[] numaralar={4,56,78};

        numaralar=reverse(numaralar);

        System.out.println("Arrays.toString(numaralar) = " + Arrays.toString(numaralar));

        int[] numaralar2={0,0,7};
        numaralar2=reverse(numaralar2);

        System.out.println("Arrays.toString(numaralar2) = " + Arrays.toString(numaralar2));
    }

    public static int[] reverse(int[] nums) {

        int[] yeniArray=new int[nums.length];

        for (int i = 0; i < nums.length ; i++) {
           yeniArray[i]=nums[nums.length-1-i];
        }
        return  yeniArray;
    }


}
