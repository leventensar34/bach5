package Extra_Grup1_Calisma.Arrays;

import java.util.Arrays;

public class RaggedArray {
    public static void main(String[] args) {
       /*
         1-Ragget bir multi Array dir
         2-Duzensiz Array demektir
         3- Row --> satiri kesinlikle yazmamiz lazim
         4-Column-->sutunu yazmiyoruz. sutunlar degiskenlik gosterir, farkli farkli olabilir demektir
         5- sutun sayisini biz kendimiz belirliyoruz

        */

        int [][] ar=new int[4][5];
        System.out.println("Arrays.deepToString(ar) = " + Arrays.deepToString(ar));
        System.out.println("--------------------");
        int [][] arr=new int[4][];

        arr[0]=new int[2];
        arr[1]=new int[4];
        arr[2]=new int[3];
        arr[3]=new int[1];

        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));

    }


}
