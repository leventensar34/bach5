package days36_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiArrays3 {

    public static void main(String[] args) {

        System.out.println("----- Tek boyutlu-----");
        String[] array=new String[]{"Ahmet","Mehmet","Fatma"};
        System.out.println(Arrays.toString(array));
        System.out.println();

        System.out.println("-----iki boyutlu Array------");
        String[][] arrayTwoDim=new String[][]{{"Mustafa","Ahmet"},{"Ayse","Melek"}};
        System.out.println(Arrays.deepToString(arrayTwoDim));


        System.out.println(" ----For Loop----");
        for (int i = 0; i < arrayTwoDim.length ; i++) {

            for (int j = 0; j < arrayTwoDim[i].length ; j++) {


                System.out.print(arrayTwoDim[i][j]+",");
            }
            System.out.println();
        }

    }
}
