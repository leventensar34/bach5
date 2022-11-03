package days24;

public class taskPrimeNumber {

    public static void main(String[] args) {

        primeNumber(73);
        primeNumber(64);
        primeNumber(147);

    }

    public static void primeNumber(int number) {
        boolean asal = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                asal = false;
                break;
            }
        }
        if (asal) {
            System.out.println(number + " Asal sayidir");
        } else {
            System.out.println(number + " Asal sayi degildir");
        }

    }

}
