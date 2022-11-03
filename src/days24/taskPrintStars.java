package days24;

public class taskPrintStars {

    public static void main(String[] args) {
printStars(7);
 printTersStar(7);

    }
    public static void printStars(int sayi){

        for (int i =1; i <= sayi; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void printTersStar(int sayi){
        for (int i = sayi; i >=1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }


    }






}
