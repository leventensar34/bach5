package days40;

import java.util.Arrays;

public class IkiArrayElement {

    public static void main(String[] args) {

        // Bir metot olusturun parametresi int[]. Bu Arrayi reverse yapip yeni bir Array a dondurelim.

        int[] numaralar = {5, 7, 10, 3, 250, 12, 27, 39};
        // yeniArray={39,27,12,250,3,10,7,5}

        int[] sayilar = {250, 350, 450};

        int[] ints = reverseArray(numaralar);

        System.out.println("ints[0] = " + ints[0]);
        System.out.println("ints[1] = " + ints[1]);
        System.out.println("ints[ints.length-1] = " + ints[ints.length - 1]);


        int[] sayilarReserve = reverseArray(sayilar);
        System.out.println("sayilarReserve[0] = " + sayilarReserve[0]);

        System.out.println("Arrays.toString(numaralar) = " + Arrays.toString(numaralar));

    }

    public static int[] reverseArray(int[] a) {

        int[] yeniArray = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            yeniArray[i] = a[a.length - 1 - i];
        }

        return yeniArray;
    }

}
