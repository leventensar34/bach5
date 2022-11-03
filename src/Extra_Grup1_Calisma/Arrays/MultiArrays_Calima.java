package Extra_Grup1_Calisma.Arrays;

import java.util.Arrays;

public class MultiArrays_Calima {

    public static void main(String[] args) {

        /*
        1-Multi arraylar deep.toString metodu ile cagrilir
        2-Row-->satir ,, Column-->sutun demek
        3- Cok boyutlu array demektir
         */
        // 1. yontem  :Eger datalar onceden belli degil ise
        int [][] sehirMesafe=new int[3][3];
     // 1. parantes=Row-->satir
        // 2. paranter=Column-->sutun
        sehirMesafe[0][0]=1;
        sehirMesafe[0][1]=3;
        sehirMesafe[0][2]=4;
        sehirMesafe[1][0]=5;
        sehirMesafe[1][1]=1;
        sehirMesafe[1][2]=6;
        sehirMesafe[2][0]=7;
        sehirMesafe[2][1]=9;
        sehirMesafe[2][2]=0;
        System.out.println("Arrays.deepToString(sehirMesafe) = " + Arrays.deepToString(sehirMesafe));

        //2. yontem = Eger datalar onceden belli ise
        int [][] sehirMesafe2={
                {3,4,5},
                {6,7,8},
                {1,2,3},
                {4,5,6},
        };
        System.out.println("Arrays.deepToString(sehirMesafe2) = " + Arrays.deepToString(sehirMesafe2));


    }
}
