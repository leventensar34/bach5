package days24;

public class task1MethodsGreaters {

    public static void main(String[] args) {

        greatestNumber(20, 45, 65);
        greatestNumber(87, 13, 76);

    }

    public static void greatestNumber(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " En buyuk sayidir");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " En buyuk sayi");
        } else {
            System.out.println(num3 + " En buyuk sayidir");
        }
    }


}
