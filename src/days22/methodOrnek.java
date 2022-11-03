package days22;

public class methodOrnek {

    public static void main(String[] args) {
        buyukSayi();
        buyukSayi();
    }

    public static void buyukSayi() {
        int num1 = 5;
        int num2 = 10;
        if (num1 > num2) {
            System.out.println(num1 + " buyuk sayi");
        } else {
            System.out.println(num2 + " buyuk sayi");
        }
    }


}
