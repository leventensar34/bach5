package days23;

public class typeCompatibility {
    public static void main(String[] args) {
        displayNumber(10);
        // long eror
        //  displayNumber(10000000000000000);

        //  double deger eror
        //displayNumber(10.5);
        short num = 5;
        displayNumber(num);

        double num2 = 10.7;
        displayNumber((int) num2);

    }

    public static void displayNumber(int number) {
        System.out.println("Value of number = " + number);

    }


}
