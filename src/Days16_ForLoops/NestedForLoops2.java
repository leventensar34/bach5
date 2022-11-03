package Days16_ForLoops;

public class NestedForLoops2 {

    public static void main(String[] args) {

        System.out.println("Carpim Tablosu");

        for (int i = 1; i <= 10; i++) {
            if ((i == 6) || (i == 9) || (i == 10)) {
                System.out.println(i + " lar");
            } else {
                System.out.println(i + " ler");
            }     /// int a=5;
            System.out.println("------");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }

    }
}
