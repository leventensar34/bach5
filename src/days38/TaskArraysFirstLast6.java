package days38;

public class TaskArraysFirstLast6 {

    public static void main(String[] args) {

//       Bir method olusturun!!
//        Given an array of ints, return true if 6 appears as either the first or last element in the array.
//        The array will be length 1 or more.
//
//        firstLast6([1, 2, 6]) → true
//        firstLast6([6, 1, 2, 3]) → true
//        firstLast6([13, 6, 1, 2, 3]) → false


    }

    public static boolean firstLast6(int[] numara) {
        int[] numaralar = {2,7,5,6};

        if (numaralar[0] == 6 || numaralar[numaralar.length - 1] == 6) {
            return true;
        } else {
            return false;
        }

    }

}
