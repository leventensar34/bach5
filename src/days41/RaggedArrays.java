package days41;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RaggedArrays {

    public static void main(String[] args) {

        int[][] karmasikArray=new int[3][];

        karmasikArray[0]=new int[3];
        karmasikArray[1]=new int[2];
        karmasikArray[2]=new int[1];

        System.out.println("Son atama: "+ Arrays.deepToString(karmasikArray));


    }
}
