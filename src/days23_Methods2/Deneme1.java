package days23_Methods2;

public class Deneme1 {

    public static void main(String[] args) {
        toplama(5);

    }

    public static void toplama(int sayi) {
        int toplam = 0;
        for (int i = 1; i <= sayi; i++) {
            toplam = toplam + i;
        }
        System.out.println(toplam);


    }

}
