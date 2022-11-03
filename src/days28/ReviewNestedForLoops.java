package days28;

public class ReviewNestedForLoops {

    public static void main(String[] args) {
     /*   // ucgen cizimi
     // not: 1. for satir sayisi, 2. for sutun sayisini verir
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------");
//         1
//         22
//         333
//         4444
//         55555
//
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("-----------");

//      1
//      12
//      123
//      1234
//      12345
//
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("--------------");

        /////// 1 den 10 kadar sayilari yan yana yazdiralim.

        for (int j = 0; j < 3; j++) {

            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");

            }
            System.out.println();

        } */
        //// 1 den 10 kadar olan sayilarin toplami

        int toplam=0;
        for (int i = 1; i <=10 ; i++) {
            toplam+=i;
        }
        System.out.println(toplam);



    }
}
