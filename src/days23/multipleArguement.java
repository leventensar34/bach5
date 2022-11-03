package days23;

public class multipleArguement {

    public static void main(String[] args) {

        calculation(5, 10);
        calculation(13, 75);
        calculation(87, 93);

    }

    public static void calculation(int num1, int num2) {

        int total;
        total = num1 + num2;
        System.out.println("Toplam deger = " + total);

    }


}
