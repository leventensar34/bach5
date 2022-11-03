package days36_MultiDimensionalArrays;

import java.util.Arrays;

public class Exercise1 {

    public static void main(String[] args) {


        int[][] numbers = new int[3][3];
        for (int r = 0; r < numbers.length; r++) {
            for (int c = 0; c < numbers[0].length; c++) {
                numbers[r][c] = r + c;
            }
        }
        System.out.println(Arrays.deepToString(numbers));

    }
}

