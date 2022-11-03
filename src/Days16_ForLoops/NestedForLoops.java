package Days16_ForLoops;

public class NestedForLoops {

    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i+" Ahmet");
            for (int j = 1; j <=3 ; j++) {
                System.out.println(j+"-Mehmet");
                for (int k = 1; k <=3 ; k++) {
                    System.out.println(k+"-Ali");
                }
            }
        }
    }
}
