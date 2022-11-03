package days24;

public class taskCalculator {

    public static void main(String[] args) {
        calculator(5, 9, '*');
        calculator(400, 0, '/');

    }

    public static double calculator(double num1, double num2, char islem) {
        double sonuc = 0;

        switch (islem) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                if (num2 == 0) {
                    return 0.0;
                }
                break;
            default:
                System.out.println("Sonuc yok");

        }
        return sonuc;

    }


}
