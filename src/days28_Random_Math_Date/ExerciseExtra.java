package days28_Random_Math_Date;

import java.util.Scanner;

public class ExerciseExtra {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("----Guess Number----");

        int randomNum = 0;
        int guessNumber = 0;
        int sayac = 0;
        randomNum = (int) (Math.random() * 10 + 1);

        for (int i = 0; i < 10; i++) {

            System.out.println("Lutfen tahmini sayi giriniz: ");
            guessNumber = scan.nextInt();
            sayac++;
            if (guessNumber == randomNum) {
                System.out.println("Tebrikler randoNumi " + sayac + "." + " seferde buldunuz");
                break;
            }else {
                System.out.println("Malesef yanlis tahmin yaptiniz");
            }
            if (guessNumber == 10) {
                System.out.println(sayac + " sefer tahmin hakkiniz bitmistir");
                break;
            }

        }

    }


}

