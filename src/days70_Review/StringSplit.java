package days70_Review;

import java.util.Arrays;

public class StringSplit {

    public static void main(String[] args) {

        String str1="1992-234-567-77";

        String[] arrayString=str1.split("-");
        System.out.println("Arrays.toString(arrayString) = " + Arrays.toString(arrayString));

        for (String str : arrayString) {
            System.out.println(str);
        }

        System.out.println("-----------------");


        str1="1992.234.567.3425";

        String[] arrayString1=str1.split("[.]");// Noktaya ozgu koseli parantes kullanilmali
        System.out.println("arrayString1.length = " + arrayString1.length);
        for (String str : arrayString1) {
            System.out.println(str);
        }
    }
}
