package days33_Arrays;

public class Array2 {

    public static void main(String[] args) {

        System.out.println("Temel dizi kavramlari");
        String[] arabalar = new String[4];

        int[] sayilar = {1, 3, 4, 5, 6};
        System.out.println("sayilar[2] = " + sayilar[2]);
        int[] sayilarDef = new int[4];
        System.out.println("sayilarDef[3] = " + sayilarDef[3]);

        arabalar[0] = "Mazda";
        arabalar[1] = "Mercedes";
        arabalar[2] = "Bmw";
        arabalar[3] = "Ford";

        System.out.println("arabalar[0] = " + arabalar[0]);
        System.out.println("arabalar[1] = " + arabalar[1]);
        System.out.println("arabalar[2] = " + arabalar[2]);
        System.out.println("arabalar[3] = " + arabalar[3]);

        System.out.println("sayilar.length = " + sayilar.length);

        System.out.println("arabalar.length = " + arabalar.length);

        System.out.println("sayilar.length-1 = " + sayilar[(sayilar.length - 1)]);
        System.out.println("sayilar[(sayilar.length-3)] = " + sayilar[(sayilar.length - 3)]);

    }
}
