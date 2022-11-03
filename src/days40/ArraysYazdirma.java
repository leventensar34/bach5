package days40;

import java.util.Arrays;

public class ArraysYazdirma {

    public static void main(String[] args) {




        int[] numaralar={1,3,5,7,9};

        System.out.println("Arrays.toString(numaralar) = " + Arrays.toString(numaralar));


        String[] mevsimler={"ilkbahar","yaz","sonbahar","kis"};

        System.out.println("Arrays.toString(mevsimler) = " + Arrays.toString(mevsimler));

        String seasons=Arrays.toString(mevsimler);
        System.out.println("seasons = " + seasons);


    }
}
