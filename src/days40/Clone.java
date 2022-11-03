package days40;

import java.util.Arrays;

public class Clone {

    public static void main(String[] args) {


        int[] numaralar = {200, 300, 400};
        int[] clone = numaralar.clone();
        System.out.println("clone[0] = " + clone[0]);

        System.out.println("Arrays.equals(numaralar,clone) = " + Arrays.equals(numaralar, clone));

        int[] sayilar = {200, 100, 50, 500, 600};
        Arrays.sort(sayilar);

        System.out.println("Arrays.toString(sayilar) = " + Arrays.toString(sayilar));


        System.out.println("Arrays.binarySearch(sayilar,500) = " + Arrays.binarySearch(sayilar, 500));

        System.out.println("indexBulma(sayilar,500) = " + indexBulma(sayilar, 500));

        System.out.println("indexBulma(sayilar,700) = " + indexBulma(sayilar, 700));


    }
    // bu binary mrtodunu manuelde kendimiz yapabiliriz

    public static int indexBulma(int[] sayilar, int key) {

        int sayac = 0;
        int returnIndex = 0;
        for (int sayi : sayilar) {
            if (sayi == key) {
                System.out.println("Arrayin icnde aradiginiz sayi bulundu");
                returnIndex = sayac;
                break;
            }
            sayac++;
        }

        if (sayac == sayilar.length) {
            returnIndex = -1;
        }
        return returnIndex;
    }

}
