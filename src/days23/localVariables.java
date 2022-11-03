package days23;

public class localVariables {

    public static void main(String[] args) {

        calculation1(4, 67);
        calculation2(5, 12);

    }

    public static void calculation1(int num1, int num2) {
        int result;
        result = num1 + num2;

        System.out.println("result = " + result);
    }

    public static void calculation2(int num1, int num2) {
        int result;
        result = num1 * num2;

        System.out.println("result = " + result);
    }

}
