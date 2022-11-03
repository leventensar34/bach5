package days33_Arrays;

import java.util.Arrays;

public class Array3_Yazdirma {

    public static void main(String[] args) {

        System.out.println("Dizi elemanlarinin Yazdirilmasi");

        String[] arabalar = {"Mazda", "Murat", "Sahin", "Wolkswagen", "BMW"};

        System.out.println("arabalar[2] = " + arabalar[0]);
        System.out.println("arabalar[2] = " + arabalar[1]);
        System.out.println("arabalar[2] = " + arabalar[2]);
        System.out.println("arabalar[2] = " + arabalar[3]);
        System.out.println("arabalar[2] = " + arabalar[4]);

        // 1. yontem
        System.out.println("-----For..Loop-----");
        for (int i = 0; i < arabalar.length; i++) {
            System.out.println(i + ". indexli elemani: " + arabalar[i]);
        }

        System.out.println("-------Foreach-------");
        //2. yontem
        // For..each  ile dizi elemanlarinin ekrana yazdirilmasi
        System.out.println("-----Foreach-----");

        for (String araba : arabalar) {
            System.out.println("Araba adi = " + araba);
        }

        //3.yontem
        // Arrays.toString();
        System.out.println("-----Arrays.toString-----");
        System.out.println("Arabalar: "+Arrays.toString(arabalar));


    }
}
