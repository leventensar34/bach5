package days33_Arrays;

public class ArrayOutOfBounds {

    public static void main(String[] args) {


        int[] arr={50,60,70,80};

        for (int i = 0; i <= arr.length ; i++) {

             /*mantıksal karşılaştırma bloğunda "="  olduğundan dizinin [4] indeksli elemanına erişmeye çalışacak bu durumda

                Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
                hatasına neden olacak.

                hata alamamak için for bloğu aşağıdaki gibi olmalı

                for (int i = 0; i < arr.length; i++)
            */
            System.out.println(arr[i]);
        }
    }
}
