package days40;

public class ArraysCommonEnd {

    public static void main(String[] args) {
//
//        Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
//        Both arrays will be length 1 or more.
//
//        commonEnd([1, 2, 3], [7, 3]) → true
//        commonEnd([1, 2, 3], [7, 3, 2]) → false
//        commonEnd([1, 2, 3], [1, 3]) → true

        int[] numaralar1 = {1, 2, 3};
        int[] numaralar2 = {7, 33};

      boolean sonSayiKontrol;
        System.out.println(sonSayiKontrol(numaralar1,numaralar2));


    }

    public static boolean sonSayiKontrol(int[] x, int[] y) {

        if (x[x.length - 1] == y[y.length - 1]) {

            return true;
        } else {
            return  false;
        }

    }


}
