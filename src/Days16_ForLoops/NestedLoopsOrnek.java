package Days16_ForLoops;

public class NestedLoopsOrnek {

    public static void main(String[] args) {
      /*  // task 1: carpim  tablosu
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {

                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        } */

      /*  // task 2: yildiz kare cizimi

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        } */

      // task 3: dik ucgen cizimi

        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

       /* //task 4: ters dik ucgen cizimi

        for (int i = 8; i >1 ; i--) {
            for (int j = 1; j <i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        } */




    }
}
