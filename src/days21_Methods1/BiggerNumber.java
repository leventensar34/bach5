package days21_Methods1;

public class BiggerNumber {

    public static void main(String[] args) {
        biggerNumber();
        biggerNumber();

    }

    public static void biggerNumber() {
        int num1 = 11;
        int num2 = 22;
        if (num1 > num2) {
            System.out.println(num1 + " is bigger number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is bigger number");


        } else {
            System.out.println("numbers is equal");
        }

    }
}
