package days33;

import java.util.Scanner;

public class CelciusFahrenheitDonusum {

    public static void main(String[] args) {

fahrenheitHesap();

    }

    public static void fahrenheitHesap() {

        Scanner scan = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Lutfen Celcius degerini giriniz: ");
        celsius = scan.nextDouble();

        fahrenheit = (9 * celsius) / 5 + 32;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }


}
