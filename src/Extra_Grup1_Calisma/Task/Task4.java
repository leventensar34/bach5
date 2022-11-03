package Extra_Grup1_Calisma.Task;

public class Task4 {

    public static void main(String[] args) {


        // Task 4:
//
//        Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
//        Both arrays will be length 1 or more.
//
//        commonEnd([1, 2, 3], [7, 3]) → true
//        commonEnd([1, 2, 3], [7, 3, 2]) → false
//        commonEnd([1, 2, 3], [1, 3]) → true


        int[] numbers1 = {1, 2, 33};
        int[] numbers2 = {7, 3};

        System.out.println(commonEnd(numbers1, numbers2));


    }

    public static boolean commonEnd(int[] a, int[] b) {

        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        } else {
            return false;
        }


    }
}
