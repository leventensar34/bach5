package days22;

public class PrimeNumber {

    public static void main(String[] args) {

        /*
        1 den 30 kadar olan tek sayilari toplayin. Bu isleme 12 ve 14 dahil edelim!!
         */

        int a = 1;
        int sum = 0;

        while (a <= 30) {

            if (a % 2 != 0) {

                sum += a;
            } else if (a == 12 || a == 14) {
                sum += a;

            }
            a++;
        }
        System.out.println(sum);

        System.out.println("------------------------------");

        ///////// 2. yol

        a = 0;
        int result=0;
        while (a < 30) {
            a++;
            if (a % 2 == 0 && a != 12 && a != 14) {
                continue;

            }
            result += a;
        }
        System.out.println(result);

        System.out.println("---------------------");



    }
}

