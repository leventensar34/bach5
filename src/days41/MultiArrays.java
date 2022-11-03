package days41;

import java.util.Arrays;

public class MultiArrays {

    public static void main(String[] args) {

        //  1. yol : Eger Datalar  onceden belli ise

        int[][] sehirMesafe = {
                {0, 2, 3},
                {2, 0, 4},
                {3, 4, 0},
        };

        System.out.println("Sehirler arasi mesafeler-1: "+Arrays.deepToString(sehirMesafe));


        // 2. yol: Eger datalar onceden belli degilse

        int[][] sehirMesafe2 = new int[3][3];

        sehirMesafe2[0][0] = 0;
        sehirMesafe2[0][1] = 2;
        sehirMesafe2[0][2] = 3;
        sehirMesafe2[1][0] = 2;
        sehirMesafe2[1][1] = 0;
        sehirMesafe2[1][2] = 4;
        sehirMesafe2[2][0] = 3;
        sehirMesafe2[2][1] = 4;
        sehirMesafe2[2][2] = 0;

        System.out.println("Sehirler arasi mesafeler-2: "+Arrays.deepToString(sehirMesafe2));

        System.out.println("sehirMesafe2 satir uzunlugu = "+sehirMesafe2.length);

        System.out.println("sehirMesafe2  sutun uzunlugu = "+sehirMesafe2[0].length);


        /////////////////////////////////

        int [] sayilar={4,8,12};
        System.out.println("sayilar= "+Arrays.toString(sayilar));



    }
}
