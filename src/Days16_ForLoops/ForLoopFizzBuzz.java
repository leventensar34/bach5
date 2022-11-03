package Days16_ForLoops;

public class ForLoopFizzBuzz {
    public static void main(String[] args) {

        /*
        FizzBuzz. Birden 100 e kadar sayıları yazdırınız.
        Algoritma:
            -Eğer bir sayı 3'e tam bölünebiliyorsa ekrana "Fizz" yazdırın.
            -Eğer bir sayı 5'e tam bölünebiliyorsa ekrana "Buzz" yazdırın.
            -Eğer bir sayı hem 3'e hem de 5'e tam bölünebiliyorsa ekrana "FizzBuzz" yazdırın.
         */

        for (int i = 1; i <= 50; i++) {
            // first check if number is divisible by 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + "-->FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println(i + "-->Buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + "-->Fizz");
            } else {
                System.out.println(i);
            }
        }


    }
}
