package days24;

public class ReviewEnBuyukSayi {

    public static void main(String[] args) {
        System.out.println(enbuyukSayi(7, 12));
        System.out.println(enbuyukSayi(76, 123));
        System.out.println(enbuyukSayi(55, 55));
    }

    public static int enbuyukSayi(int num1, int num2) {

        if (num1 > num2) {
            return num1;

        } else if (num1 == num2) {
            return 0;
        } else {
            return num2;
        }

    }

}
