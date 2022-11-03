package Days14_SwitchCase;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int gun;
        String name = "";
        String gunTuru="";
        String sonuc="";
        System.out.print("Lutfen sayi giriniz: ");
        gun= scan.nextInt();
        switch (gun) {
            case 1:
                name = "Pazartesi";

                break;
            case 2:
                name = "Sali";
                break;
            case 3:
                name = "Carsamba";
                break;
            case 4:
                name = "Persembe";
                break;
            case 5:
                name = "Cuma";
                break;
            case 6:
                name = "Cumartesi";
                break;
            case 7:
                name = "Pazar";
                break;
            default:
                name="Gecersiz bir gun girdiniz!!";
        }
        System.out.println("name = " + name);

        switch (gun){
            case 1: case 2:case 3:case 4:case 5:
                gunTuru="Hafta ic gunudur";
                sonuc="en sevmedigim gunler";
                break;
            case 6:  case 7:
                gunTuru="Haftasonu gunudur";
                sonuc="en sevdigim gunler";
                break;
            default:
                gunTuru="Gun siniflandirilamadi";
        }
        System.out.println("gunTuru = " + gunTuru);
        System.out.println("sonuc = " + sonuc);
    }

}
