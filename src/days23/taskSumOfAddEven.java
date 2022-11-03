package days23;

public class taskSumOfAddEven {

    public static void main(String[] args) {

        int num = 50;
        int sumOfOdd = 0;
        int sumOfEven = 0;

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                sumOfOdd += i;
            } else {
                sumOfEven += i;
            }

        }
        sumOfEvenNumbers();
        System.out.println(sumOfEven);
        sumOfOddNUmbers();
        System.out.println(sumOfOdd);


    }

    public static void sumOfEvenNumbers() {

        System.out.println("Sum of Even Numbers is = ");
    }

    public static void sumOfOddNUmbers() {
        System.out.println("Sum of Odd Numbers is = ");

    }


}
