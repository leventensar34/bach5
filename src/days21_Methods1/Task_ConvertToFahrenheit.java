package days21_Methods1;

public class Task_ConvertToFahrenheit {

    public static void main(String[] args) {

        //Write a method that converts Celsius to Fahrenheit

        convertToFahrenheit();
    }

    public static void convertToFahrenheit() {

        double Celsius = 70;

        double Fahrenheit = (9 * Celsius / 5) + 32;

        System.out.println(Celsius + " celsius is equel to " + Fahrenheit + " fahrenheit");

    }


}
