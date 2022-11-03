package Days19_DoWhileLoop;

public class DoWhileLoop2 {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (i % 3 == 0) {
                continue;
            }
            sum += i;

        }
        System.out.println("sum = " + sum);

        System.out.println("-----------");

        int i = 1, sum1 = 0;
        while (i < 3) {
            if (i % 3 == 0) {
               continue;

            }
            sum1 += i;
            i++;
        }
        System.out.println("sum1 = " + sum1);

    }
}
