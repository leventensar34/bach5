package days40;

public class ArraysFirstLast {

    public static void main(String[] args) {
//
//        Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
//
//        sameFirstLast([1, 2, 3]) → false
//        sameFirstLast([1, 2, 3, 1]) → true
//        sameFirstLast([1, 2, 1]) → true
        // Arrayin ilk ve son elementini kontrol et. Ayni ise true, degilse false


        int[] numaralar = {3, 5, 7};
        int[] sayilar = {10, 12, 20, 10};

        ilkVeSonElementKontrol(numaralar);
        ilkVeSonElementKontrol(sayilar);

        System.out.println("---------------------------------");
        String[] almanyaKulupleri = {"frankfurt", "bayer munih", "studgart", "werder bremen", "dortmunt" };

        ilkVeSonElementKontrol(new String[]{"barselona", "hamburg", "milan", "barselona" });
        ilkVeSonElementKontrol(almanyaKulupleri);

    }

    public static void ilkVeSonElementKontrol(int[] numaralar) {

        if (numaralar[0] == numaralar[numaralar.length - 1]) {
            System.out.println("Ilk ve son numaralar esit");
        } else {
            System.out.println("Ilk ve son numaralar esit degil");
        }
    }

    public static void ilkVeSonElementKontrol(String[] futbolKulupleri) {

        if (futbolKulupleri[0].equals(futbolKulupleri[futbolKulupleri.length - 1])) {
            ;
            System.out.println("Ilk ve son kulupler esit");
        } else {
            System.out.println("Ilk ve son kuluplere esit degil");
        }
    }


}