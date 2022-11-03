package Extra_Grup1_Calisma.Arrays;

import java.util.Arrays;

public class Arrays_Calisma {
    public static void main(String[] args) {
//
        /*
        1-Array bir kume demektir, parantesle olusturulur.
        2-Iki sekilde deklare edilebilir
        3-direk Arrays.toString methodu ile cagrilabili
        4-for yada foreach yontemleri ile yazdirilabilir

         */



//        String araba="honda";
//        String araba2="renault";
//        String araba3="sahin";

        //1. yontem
        // not: Arraylerde index no sifirdan baslar
        String[] arabalar = new String[3];
        arabalar[0] = "honda"; //
        arabalar[1] = "renault";
        arabalar[2] = "sahin";

        System.out.println("arabalar[0] = " + arabalar[0]);
        System.out.println("arabalar[1] = " + arabalar[1]);
        System.out.println("arabalar[2] = " + arabalar[2]);

        // 2. yontem
        int[] sayilar ={20,10,30,50,40};
        //               0  1  2  3  4  index nolar
        System.out.println("Arrays.binarySearch(sayilar,30) = " + Arrays.binarySearch(sayilar, 30));
        System.out.println("Arrays.binarySearch(sayilar,50) = " + Arrays.binarySearch(sayilar, 50));
        System.out.println("sayilar[2] = " + sayilar[2]);
        System.out.println("sayilar[3] = " + sayilar[3]);
        System.out.println("sayilar.length = " + sayilar.length);
        System.out.println("sayilar[sayilar.length-1] = " + sayilar[sayilar.length - 1]);

        /// 1. yazdirma foreach= iter;
        for (int i : sayilar) {
            System.out.print(i+",");
        }

        System.out.println("------------------");
       // for-loop // =itar

        for (int i = 0; i < sayilar.length; i++) {
            int i1 = sayilar[i];
        }

        // 3. yontem
        System.out.println("Arrays.toString(arabalar) = " + Arrays.toString(arabalar));
        System.out.println("Arrays.toString(sayilar) = " + Arrays.toString(sayilar));

    }

}
