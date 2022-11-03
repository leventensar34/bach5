package Days16_ForLoops;

public class AsalSayiBulma {

    public static void main(String[] args) {
        // 0 ile 100 arasinda daki  asal sayilari yazdirin

        int sayac = 0;
        for (int i = 3; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac==0){
                System.out.println(i+" asal sayidir");
            }
            sayac=0;
        }


    }

}
