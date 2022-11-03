package Days16_ForLoops;

public class ForLoopsTasks {

    public static void main(String[] args) {

      /*  // task 1: 1 den 100 e kadar yan yana sayilari yazdiralim

        for (int i = 1; i < 100; i++) {
            System.out.print(i+" ");
        } */

      /*  // task 2: 1 den 100 kadar 2 ser  2 ser  yan yana yazdiralim
        for (int i = 0; i <100; i+=2) {
            System.out.print(i+" ");
        }  */

      /*  // task 3: 1 den 100 kadar 3 er 3 er yan yana yazdiralim

        for (int i = 0; i <100 ; i+=3) {
            System.out.print(i+" ");

     /*   // task 4: 0 dan 100 kadar sayilari tek vaya cift yazdirin

        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(i+" Cift sayidir");
            }else{
                System.out.println(i+" Tek sayidir ");
            }
        }  */

      /*  // task 5: carpim tablosu

        int a = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        } */

      /*  // task 6: 100 den 1 kadar geriye sayilari yazdir

        for (int i = 100; i >0 ; i--) {
            System.out.print(i+" ");
        }  */

      /*  // task 7: 1,2,3,4,5,6,7,8,9,10. seklinde yazdiralim

        for (int i = 1; i <=10 ; i++) {
            if (i!=10){
                System.out.print(i+",");
            }else{
                System.out.print(10+".");
            }
        }  */

       /* // task 8: 100 den 0 kadar sayilari 3 er azalarak yaziniz
        int sayac = 0;
        for (int i = 0; i < 3000; i++) {
            if (i % 7 == 0) {
                sayac++;
            }
        }
        System.out.println("0-3000 arasinda 7 ye bolunebilen "+sayac+" tane sayi vardir"); */

       /* // task 9: Bir sayiya en yakin olan sayi bulma. Mesala 100 e 20 mi yoksa 110 mu daha yakin

        int x = 70;
        int y = 40;
        int score1 = (100 - x);
        int score2 = (x - 100);
        int score3 = (100 - y);
        int score4 = (y - 100);
        if (score1 == score3 && score2 == score4) {
            System.out.println("x ve y 100 e esit uzakliktadir");
        } else if (score1 > score3 && score2 < score4) {
            System.out.println("y 100 daha yakindir");
        } else if (score1 < score3 && score2 > score4) {
            System.out.println("x 100 e daha yakindir");
        } else {
            System.out.println("sistem disi");
        } */

      /*  // task 10: 0 dan 200 e kadar olan sayilari toplami

        int sum=0;
        for (int i = 0; i <=200 ; i++) {
            sum+=i;
        }
        System.out.println("sum = " + sum); */

      /*  // task 11: 0 dan 200 e kadar 7 ye bolunen sayilarin toplami

        int sum2=0;
        for (int i = 0; i <=200 ; i++) {
            if (i%7==0){
                sum2+=i;
            }
        }
        System.out.println("sum2 = " + sum2); */

      /*  // task 12: 1 ve 2 den baslayip 15 tane sayinin Fibonacci dizisi toplamini yaziniz

        int sum3=0;
        for (int i = 1; i <=14 ; i++) {
           sum3+=i;
            System.out.println("sum3 = " + sum3);
        } */


    }
}
