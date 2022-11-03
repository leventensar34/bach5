package days28;

public class ReviewTask3 {

    public static void main(String[] args) {
        /// deltoit cizimi
        int numara = 5;
        for (int i = 1; i < 8; i++) {
            for (int j = 5; j > i * 2 - 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                if (i >= 5) {
                    break;
                }
                System.out.print(" *");
            }
            if (i >= 5) {
                for (int l = 8; l < 2 * i - 1; l++) {
                    System.out.print(" ");

                }
                for (int n = numara; n >= 1; n--) {
                    System.out.print(" *");
                }
                numara=numara-2;
            }
            System.out.println();
        }


    }
}
