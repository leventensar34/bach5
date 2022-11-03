package Days17_Review;

public class Task_TekCift {

    public static void main(String[] args) {

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        // 2. yol
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " tek sayi");
            } else {
                System.out.println(i + " cift sayi");
            }
        }


    }

}
