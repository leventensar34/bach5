package Practice_AyseHoca.Week_4;

import java.util.Arrays;

public class calisma16 {

    public static void main(String[] args) {

      /*
      Ödev : //Array kabul eden bir method yazın,method array deki en küçük sayıyı bulup
    //diğer elemanların yerine yazsın,bize yeni array i dönsün
        //örn: int x={5,6,9}; ----> [9,9,9]
        // int a={136,76,9,-15,2500}; ---->[2500,2500,2500,2500,2500]
        // System.out.println(Arrays.toString(min(x)));
       */
        int[] x = {5, 6, 9};
        System.out.println(Arrays.toString(alem(x)));

        int[] y={136,76,9,-15,2500};
        System.out.println(Arrays.toString(alem(y)));
    }

    public static int[] alem(int[] a) {
        int[] arr = new int[a.length];

        Integer max = Integer.MIN_VALUE;

        for (int number : a) {
            if (number > max) {
                max= number;
            }
        }
        for (int i = 0; i <a.length ; i++) {
            arr[i]=max;
        }
        return arr;
    }
}