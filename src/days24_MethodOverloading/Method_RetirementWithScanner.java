package days24_MethodOverloading;

import java.util.Scanner;

public class Method_RetirementWithScanner {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Adınızı giriniz .........: ");
            String ad = input.nextLine();

            System.out.print("Doğum yılınızı giriniz...: ");
            int dogumYili = input.nextInt();

            int yas = calculateAge(dogumYili);
            yearsUntilRetirement(ad,yas);


            input.close();
            // Hafıza yönetimi açısından işlem bittiğinde Scanne sınıfından ürettiğimiz "input" nesnesini kapatıyoruz.
        }

    public static int calculateAge(int dogumYili){
        int buYil = 2022;
        int age=0;
        age = buYil - dogumYili;
        return age;
    }

    public static void yearsUntilRetirement(String ad, int yas){
        int emeklilikYasi = 65;
        int emekliligeKalanSure = emeklilikYasi - yas;
        System.out.println(ad + " " + emekliligeKalanSure + " yıl sonra emekli olursun." );
    }

}
