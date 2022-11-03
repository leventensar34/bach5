package days38_Review;

public class Array_ReviewTask1 {

    public static void main(String[] args) {


//       Bir method olusturun!!
//        Given an array of ints, return true if 6 appears as either the first or last element in the array.
//        The array will be length 1 or more.
//
//        firstLast6([1, 2, 6]) → true
//        firstLast6([6, 1, 2, 3]) → true
//        firstLast6([13, 6, 1, 2, 3]) → false

        int[] x = {1, 2, 6};

        boolean b = firstLast6(x);
        System.out.println("b = " + b);

        int[] y = {13, 6, 1, 2, 3};
        boolean b2 = firstLast6(y);
        System.out.println("b2 = " + b2);


    }

    public static boolean firstLast6(int[] array) {

        if (array.length < 1) {
            return false;
        }
        if (array[0] == 6 || array[array.length - 1] == 6) {
            return true;
        } else {
            return false;
        }


    }


}
