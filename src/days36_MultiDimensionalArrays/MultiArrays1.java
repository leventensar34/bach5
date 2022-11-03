package days36_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiArrays1 {

    public static void main(String[] args) {

        int[][] matrix = new int[5][5];

        matrix[1][3] = 10;
        System.out.println(matrix[1][0]);
        System.out.println(Arrays.deepToString(matrix));

        System.out.println("Printing two dimensional array in table format");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + 1 + ".satir " + "[");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);

            }
            System.out.println("]");
        }


    }
}
