package Practice_AyseHoca.Week_3;

import java.util.Arrays;

public class calisma14 {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(alem(new int[]{2, 3, 4}, new int[]{0, 1})));

    }
    public static int[] alem(int[] a,int[] b){
        int[] newArr=new int[a.length+b.length];
        for (int i = 0; i <a.length ; i++) {
            newArr[i]=a[i];
        }
        int sayac=0;
        for (int j= a.length; j < newArr.length ; j++) {
            newArr[j]=b[sayac];
            sayac++;

        }

        return newArr;

    }
}
