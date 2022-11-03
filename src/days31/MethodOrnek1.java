package days31;

import java.io.StringReader;

public class MethodOrnek1 {

    public static void main(String[] args) {
        // iki int degiskenimiz var. buyuk sayiyi bulalim, buyuk sayiyi return edelim, main metot icinde bu metodu
        // cagiiralim, bir degisken atayip bu sayiyi cagiralim. ikisi esit ise 0 dondur


        System.out.println(buyukSayi(25, 76));
        System.out.println(buyukSayi(134, 142));
        System.out.println(buyukSayi(12, 12));
        System.out.println(buyukSayi(77, 45));

        System.out.println("-------------");

        String ay = ayBulma("Subat");
        System.out.println("ay = " + ay);

        String ay2 = ayBulma("Ocak");
        System.out.println("ay2 = " + ay2);

        String son=ayBulma("Kasim");
        System.out.println("son = " + son);

    }

    public static int buyukSayi(int num1, int num2) {
        int buyukSayi;

        if (num1 > num2) {
            return num1;
        } else if (num2 > num1) {
            return num2;
        } else {
            buyukSayi = 0;
            return 0;
        }

    }

    public static String ayBulma(String ay) {

        String month = "";
        switch (ay) {
            case "Ocak":
                return  "January";

            case "Subat":
                return  "February";
            default:
                return "Eslesmedi";
        }


    }


}


