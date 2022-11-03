package Days15_Ternary;

public class TernaryOperators1 {

    public static void main(String[] args) {

        int x, y;
        x = 20;
        y = (x == 5) ? 50 : 75;
        System.out.println("y = " + y);

        y = (x == 20) ? 50 : 75;
        System.out.println("y = " + y);

        int z = (x == 20) ? 50 : 75;
        System.out.println("z = " + z);


    }
}
