package days28;

public class ReviewDoWhile {

    public static void main(String[] args) {

        // 1 den 10 kadar olan sayilari toplamini yapiniz

        int a = 1;
        int sum = 0;
        do {

            sum += a; //
            a++;
        } while (a < 10);

        System.out.println("sum = " + sum);

        System.out.println("---------------");

        ///////// tersten do while yazdirma

        int b = 10;
        do {
            System.out.print(b + " ");
            b--;
        } while (b > 0);

        System.out.println();

     ///////////////////

        int c = 10;
        while (c > 0) {
            System.out.print(c+" ");
            c--;
        }


    }
}
