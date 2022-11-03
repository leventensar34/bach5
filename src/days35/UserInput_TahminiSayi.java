package days35;

import java.util.Scanner;

public class UserInput_TahminiSayi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int userInput;
        int secretNumber = 13;

        System.out.println("Lutfen 1 ile 20 arasinda bir sayi tahmin edin:  ");

        do {

            userInput= scan.nextInt();

            if (userInput<secretNumber){
                System.out.println("Daha buyuk bir sayi giriniz: ");
            } else if (userInput>secretNumber) {
                System.out.println("Daha kucuk bir sayi : ");
            }else{
                System.out.println("Tebrikler sayiyi buldunuz");
            }

        }while (userInput!=secretNumber);


    }
}
