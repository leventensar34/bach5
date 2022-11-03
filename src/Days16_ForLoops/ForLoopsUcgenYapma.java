package Days16_ForLoops;

public class ForLoopsUcgenYapma {

    public static void main(String[] args) {

        for (int i = 1; i <10; i++) {
            for (int j =10; j >=i*2-1 ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <i*2-1 ; k++) {
                if (i>=7){
                    break;
                }
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
