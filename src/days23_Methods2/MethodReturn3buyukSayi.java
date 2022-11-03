package days23_Methods2;

public class MethodReturn3buyukSayi {

    public static void main(String[] args) {

        System.out.println(greatestNumber(12, 45, 65));
        System.out.println(greatestNumber(87, 65, 23));

    }


    public static int greatestNumber(int num1, int num2, int num3) {

        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

}
