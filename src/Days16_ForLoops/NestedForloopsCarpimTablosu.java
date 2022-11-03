package Days16_ForLoops;

public class NestedForloopsCarpimTablosu {

    public static void main(String[] args) {

        System.out.println("\t\tBir baska sekilde carpim taplosu");
        System.out.print("\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10 ");
        System.out.println();
        for (int i = 1; i <= 50; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + "\t|\t");

            for (int k = 1; k <= 10; k++) {
                System.out.print(k * j + "\t");
            }
            System.out.println();
        }
    }
}