package days36_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiArrays2 {

    public static void main(String[] args) {

        // 1. yontem
        int[][] twoDimArray = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(Arrays.deepToString(twoDimArray));

        // 2. yontem
        int[][] ikiBoyutDizi = new int[2][3];
        ikiBoyutDizi[0][0] = 1;
        ikiBoyutDizi[0][1] = 2;
        ikiBoyutDizi[0][2] = 3;

        ikiBoyutDizi[1][0] = 4;
        ikiBoyutDizi[1][1] = 5;
        ikiBoyutDizi[1][2] = 6;

        System.out.println(Arrays.deepToString(ikiBoyutDizi));




    }
}
