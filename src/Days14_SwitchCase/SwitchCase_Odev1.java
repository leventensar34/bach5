package Days14_SwitchCase;

import java.util.Scanner;

public class SwitchCase_Odev1 {

    public static void main(String[] args) {


        /* Klavyeden 1 ile 5 arası 5 adet int veri tipinde sayı girin(Scanner Class'ını kullanabilirsiniz)
         Ekrana bu sayıların metin karşılıklarını switch case yapısını kullanarak yazdıran bir program yazın.

         Bir, İki ....gibi
         */
        Scanner scan = new Scanner(System.in);

        int randomSayi = (int) (Math.random() * 5 + 1);
        switch (randomSayi) {
            case 1:
                System.out.println("Random sayi "+randomSayi + " = Bir");
                break;
            case 2:
                System.out.println("Random sayi "+randomSayi + " = Iki");
                break;
            case 3:
                System.out.println("Random sayi "+randomSayi + " = Uc");
                break;
            case 4:
                System.out.println("Random sayi "+randomSayi + " = Dort");
                break;
            case 5:
                System.out.println("Random sayi "+randomSayi + " = Bes");
                break;
            default:
                System.out.println("Sistemde olmayan bir sayi girildi");


        }

    }
}
