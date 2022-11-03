package days22;

public class AsalSayiBulma {

    public static void main(String[] args) {
int sayi=100;
int sayac=0;
        for (int i = 2; i < sayi; i++) {
            for (int j = 1; j < sayi; j++) {
                if (i%j==0){
                    sayac++;
                }

            }
            if (sayac==2){
                System.out.println(i+" Asal sayidir");

            }
            sayac=0;
        }
        System.out.println(sayi);

    }


}
