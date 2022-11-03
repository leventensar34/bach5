package days24_MethodOverloading;

public class Overloading1 {


    public static void main(String[] args) {

        System.out.println(sumOfTwoNumbers(5, 6));

        int z = sumOfTwoNumbers(7, 10);
        System.out.println(z);

        System.out.println(sumOfThreeNumbers(5, 6, 7));

        System.out.println("-----------");

        // overloading

        System.out.println(sumOfNumber(7, 8));

        System.out.println(sumOfNumber(7, 8, 9));

        System.out.println(sumOfNumber(5.0f,5));

        System.out.println(sumOfNumber(7.0f,9.5f,10));

    }

    public static int sumOfTwoNumbers(int x, int y) {

        return (x + y);

    }

    public static int sumOfThreeNumbers(int x, int y, int z) {

        return (x + y + z);

    }

    public static int sumOfNumber(int x, int y) {

        return (x + y);
    }

    public static int sumOfNumber(int x, int y, int z) {

        return (x + y + z);
    }

    public static float sumOfNumber(float x, int y) {
        return (x + y);
    }

    public static float sumOfNumber(float x, float y, int z) {
        return (x + y + z);
    }


}
