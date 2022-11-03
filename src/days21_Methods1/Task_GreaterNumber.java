package days21_Methods1;

public class Task_GreaterNumber {

    public static void main(String[] args) {

        // Write a method that shows the greater from two numbers

        greaterNumber();

    }

    public static void greaterNumber() {

        int num1 = 20;
        int num2 = 30;
        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater");
        } else {
            System.out.println(" Numbers are eguals");
        }
    }


}
