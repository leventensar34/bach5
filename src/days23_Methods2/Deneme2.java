package days23_Methods2;

public class Deneme2 {

    public static void main(String[] args) {

        sayiYaz(1000000);


    }

    public static void sayiYaz(int sayi) {

        for (int i = sayi; i >= 0; i--) {
            System.out.print("\r" + i);
        }
    }
}
