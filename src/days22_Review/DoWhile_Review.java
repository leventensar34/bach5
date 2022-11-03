package days22_Review;

public class DoWhile_Review {

    public static void main(String[] args) {

        int i = 0;
        outher:
        do {
            i = 8;
            inner:
            while (true) {
                System.out.println(i--);
                if (i == 4) {
                    break outher;
                }
            }
        } while (true);

    }
}
