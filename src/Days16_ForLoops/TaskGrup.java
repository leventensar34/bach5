package Days16_ForLoops;

public class TaskGrup {
    public static void main(String[] args) {
      /* // 1 den 100 kadar cift sayilari yazdirin
        for (int i = 0; i <=100; i+=2) {
            System.out.print(i+" ");
        } */

      /*  for (int i = 0; i <=100 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        } */


        //   esref:
      /*
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.println(j);

                if (i == 2) {
                    System.out.println("loop break");
                    break esref;  // distaki loopdan cikmamizi saglayacak
                }
            }
            System.out.println();
        } */
// kare cizimi
     /*   for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <6; j++) {

                System.out.print("*"+" ");
            }
            System.out.println();
        } */

// dik ucgen
      /*  for (int i=0 ; i <7; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        } */
// ters dik ucgen
     /*   for (int i =7; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        } */
     /*   int sayac = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 6 == 0) {
                sayac++;
            }
        }
        System.out.println("sayac = " + sayac); */

      /*  int sum = 0;
        for (int i = 1; i <20; i+=2) {
            sum += i;
            System.out.println("sum = " + sum);
        } */



    }


}
