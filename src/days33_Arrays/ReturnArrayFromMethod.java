package days33_Arrays;

import java.util.Arrays;

public class ReturnArrayFromMethod {

    public static void main(String[] args) {

        System.out.println("Returning an array from a method");

        int[] liste={1,2,3,4,5,6};

        int[]sonuc=reverse(liste);

        System.out.println("Returned array...: "+Arrays.toString(sonuc));
    }

    public static int[] reverse(int[] list){
        System.out.println("Gönderilen dizi : "+Arrays.toString(list));
        System.out.println();
        int[] result=new int[list.length];

        for (int i = 0,j= result.length-1; i < list.length ; i++,j--) {

            result[j]=list[i];
        }

        return result;
    }
}
