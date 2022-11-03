package Days14_SwitchCase;

import java.util.Scanner;

public class SwitchCase5_Mevsimler {

    public static void main(String[] args) {

        System.out.println("Switch case Mevsimler");
        String ayBilgi;
        Scanner ayGir = new Scanner(System.in);

        System.out.print("Mevsimini öğrenmek istediğiniz Ay bilgisini girirniz : ");
        ayBilgi = ayGir.next(); //Klavyeden bir kelime okur.

        switch(ayBilgi){
            case "Aralık":
            case "Ocak":
            case "Şubat":
                System.out.println(ayBilgi + " Kış mevsimi");
                break;
            case "Mart":
            case "Nisan":
            case "Mayıs":
                System.out.println(ayBilgi + " İlkbahar mevsimi");
                break;
            case "Haziran":
            case "Temmuz":
            case "Ağustos":
                System.out.println(ayBilgi + " Yaz mevsimi");
                break;
            case "Eylül":
            case "Ekim":
            case "Kasım":
                System.out.println(ayBilgi + " Sonbahar mevsimi");
                break;
            default:
                System.out.println(ayBilgi + " Geçersiz bir ay bilgisi girdiniz!");

        }


    }

}
