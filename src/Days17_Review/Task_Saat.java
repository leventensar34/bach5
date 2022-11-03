package Days17_Review;

public class Task_Saat {

    public static void main(String[] args) {

        ///// Odev: Write a Java program to simulate a clock by using nested loop ////

       // 13:25:30
      //00:00:00
      // 23:59:59//
int a=0;
        for (int i = 0; i <24 ; i++) {
            for (int j = 0; j <60 ; j++) {
                for (int k = 0; k <60 ; k++) {
                    System.out.print("\r" + i + ":" + j + ":" + k);
                    for (int l = 0; l <1_000_000_000 ; l++) {
                        a=a+l;
                    }
                    a=0;
                }
            }
        }

    }
}
