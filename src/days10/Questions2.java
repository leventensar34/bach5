package days10;

public class Questions2 {

    public static void main(String[] args) {

/// task : write a program to calculate the digit of a 5 digit (76543)

        int digit = 76543;
        int digit1, digit2, digit3, digit4, digit5;

        digit1 = digit % 10;
        System.out.println("digit1 = " + digit1);

        digit2 = (digit / 10) % 10;
        System.out.println("digit2 = " + digit2);

        digit3 = (digit / 100) % 10;
        System.out.println("digit3 = " + digit3);

        digit4 = (digit / 1000) % 10;
        System.out.println("digit4 = " + digit4);

        digit5 = (digit / 10000) % 10;
        System.out.println("digit5 = " + digit5);

        System.out.println("digit = " + digit);


    }


}
