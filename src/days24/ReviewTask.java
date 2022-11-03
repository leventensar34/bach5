package days24;

public class ReviewTask {

    public static void main(String[] args) {

     // given 2 ints a and b return true of one if them is10 or if their sum is 10.

        boolean on = onNumara(1, 10);
        System.out.println("on = " + on);

        boolean on2 = onNumara(12, 67);
        System.out.println("on2 = " + on2);

        boolean on3 = onNumara(3, 7);
        System.out.println("on3 = " + on3);
        ;
    }

    public static boolean onNumara(int a, int b) {

        boolean on = false;
        if (a + b == 10) {
            on = true;
        } else if (a == 10 || b == 10) {
            on = true;
        } else {
            on = false;

        }
        return on;
    }


}
