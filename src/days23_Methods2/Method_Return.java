package days23_Methods2;

public class Method_Return {

    public static void main(String[] args) {
        calculation(23, 32);
        calculation(56, 73);

        int mainToplama = calculation(15, 5);
        System.out.println("mainToplama = " + mainToplama);

    }

    public static int calculation(int num1, int num2) {

        int total = num1 + num2;
        System.out.println("total = " + total);
        return total;
    }


}
