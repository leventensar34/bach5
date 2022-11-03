package days21_Methods1;

public class Task_SumOfOdd_Even {

    public static void main(String[] args) {

        // Write a program that iterates numbers and checks if number is even or odd , according to evaluation it sums
        //even and odd numbers , displays result in two different methods

        int sumOfOddNumbers = 0;
        int sumOfEvenNumbers = 0;
        int number = 45;

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                sumOfEvenNumbers += i;
            } else {
                sumOfOddNumbers += i;
            }
        }
        sumOfEvenNumbers(sumOfEvenNumbers);
        sumOfOddNumbers(sumOfOddNumbers);
    }

    public static void sumOfEvenNumbers(int a) {

        System.out.println("SumOfEvenNumber= " + a);
    }

    public static void sumOfOddNumbers(int b) {

        System.out.println("SumOfOddNumber= " + b);
    }
}
