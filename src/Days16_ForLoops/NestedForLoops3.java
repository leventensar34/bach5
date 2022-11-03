package Days16_ForLoops;

public class NestedForLoops3 {

    public static void main(String[] args) {
        int siralar = 10;
        for (int i = 1; i <= siralar; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
