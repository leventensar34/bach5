package days39_WrappersClass2;

import static java.lang.Character.*;

public class Task5 {

    public static void main(String[] args) {


        System.out.println(sumOfDigits("234"));


    }

    public static int sumOfDigits(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum = sum + s.charAt(i);
            }
        }

        return sum;
    }
}
