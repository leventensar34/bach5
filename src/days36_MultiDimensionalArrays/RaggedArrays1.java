package days36_MultiDimensionalArrays;

import java.util.Arrays;

public class RaggedArrays1 {

    public static void main(String[] args) {

        int[][] triangleArray = new int[3][];

        triangleArray[0] = new int[2];
        triangleArray[1] = new int[5];
        triangleArray[2] = new int[3];

        triangleArray[0][0]=5;
        triangleArray[0][1]=1;

        System.out.println(Arrays.deepToString(triangleArray));

        System.out.println("----For Loop----");
        for (int i = 0; i < triangleArray.length; i++) {

            for (int j = 0; j < triangleArray[i].length ; j++) {

                System.out.print(triangleArray[i][j]+" ");
            }
            System.out.println();
        }



    }
}

