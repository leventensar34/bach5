package ExtraSelbsCodingBad;

public class Arrays_Sum3 {

    public static void main(String[] args) {

//        Given an array of ints length 3, return the sum of all the elements.
//
//        sum3([1, 2, 3]) → 6
//        sum3([5, 11, 2]) → 18
//        sum3([7, 0, 0]) → 7

        int[] numaralar = {7, 0, 0};

        System.out.println(sum3(numaralar));

    }

    public static int sum3(int[] nums) {
        int sum;
        nums = new int[3];

        sum = nums[0] + nums[1] + nums[2];
        return  sum;
    }


}
