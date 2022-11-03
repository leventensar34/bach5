package days49;

import java.util.ArrayList;
import java.util.Arrays;

public class Metodlar2 {

    public static void main(String[] args) {

        ArrayList<Integer> numaralar = new ArrayList<>();
        numaralar.add(3);
        numaralar.add(13);
        numaralar.add(23);
        numaralar.add(3);
        System.out.println("numaralar = " + numaralar);

        System.out.println(numaralar.get(0)); // get(); metodu index numarasina gore elemanlari tek yazdirir.
        System.out.println(numaralar.get(1));
        System.out.println(numaralar.get(2));
        System.out.println(numaralar.get(3));

        numaralar.set(0, 100);  // set(); metodu index yerine baska bir deger yazmak icin kullanilir
        System.out.println("numaralar.get(0) = " + numaralar.get(0));
        numaralar.add(0, 200);
        System.out.println("numaralar = " + numaralar);

        numaralar.set(0, 300);
        System.out.println("numaralar = " + numaralar);
        numaralar.add(500);
        System.out.println("numaralar = " + numaralar);

        System.out.println("numaralar.get(3) = " + numaralar.get(3));

        numaralar.add(13);
        System.out.println("numaralar = " + numaralar);

        System.out.println("numaralar.indexOf(13) = " + numaralar.indexOf(13));
        System.out.println("numaralar.lastIndexOf(13) = " + numaralar.lastIndexOf(13));

        System.out.println("-------------------");

        // remove(); motodu index numarasi vrilen objeyi ArrayList ten siler.

        System.out.println("numaralar.remove(\"300\") = " + numaralar.remove("300"));
       // numaralar.remove(0);
        System.out.println("numaralar = " + numaralar);
        numaralar.remove(0);
        System.out.println("numaralar = " + numaralar);


    }
}
