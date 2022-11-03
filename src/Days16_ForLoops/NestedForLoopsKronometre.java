package Days16_ForLoops;

public class NestedForLoopsKronometre {

    public static void main(String[] args) {

        for (int i = 0; i <= 60; i++) {
           // System.out.println(i + ":");
            for (int j = 0; j <= 60; j++) {
                for (int k = 0; k <= 1000000; k++) {
                    System.out.print("\r" + i + ":" + j + ":" + k);
                }
            }

        }

    }
}
