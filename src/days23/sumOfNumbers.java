package days23;

public class sumOfNumbers {
    public static void main(String[] args) {

        int number = 30;
        int sumOfOddNumber = 0;
        int sumOfEvenNumber = 0;

        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0) {
                sumOfOddNumber += i;
            } else {
                sumOfEvenNumber += i;
            }

        }
        sumOfOddNumber(sumOfOddNumber);
        sumOfEvenNumber(sumOfEvenNumber);

    }

    public static void sumOfOddNumber(int num1) {
        System.out.println("sumOfOddNumbers = " + num1);

    }

    public static void sumOfEvenNumber(int num2) {

        System.out.println("sumOfEvenNumber = " + num2);
    }


}
