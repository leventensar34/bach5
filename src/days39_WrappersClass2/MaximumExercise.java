package days39_WrappersClass2;

public class MaximumExercise {

    public static void main(String[] args) {


        int[] num={123,34,5432,11,78965};

        System.out.println(maxDeger(num));


    }

    public static int maxDeger(int[] array){

        Integer max=Integer.MIN_VALUE;
        for (int number : array) {
            if(number>max){
                max=number;
            }
        }

        return max;
    }

}
