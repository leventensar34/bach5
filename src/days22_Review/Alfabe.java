package days22_Review;

public class Alfabe {

    public static void main(String[] args) {

        char Harf = 'A';
        while (Harf <= 'Y') {
            System.out.print(Harf + ",");

            Harf++;
            if (Harf == 'Z') {
                System.out.println(Harf + ".");

            }
        }


    }

}
