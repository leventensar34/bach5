package days48;

public class MaximumNumber {

    public static void main(String[] args) {

        // Write a method that finds the maximum number from int Array

        int[] numbers={23472,34714,13412,1414,11244};

        System.out.println(maxValue(numbers));


    }

    public static int maxValue(int[] array){

        Integer max=Integer.MIN_VALUE;
        for (int each : array) {
            if (each>max){
                max=each;
            }
        }

return max;
    }

}
