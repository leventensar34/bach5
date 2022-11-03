package days62_Exception2;

import java.util.Scanner;

public class Excercise4 {

    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        int sayi=1, toplam=0;

        while (sayi>0){
            System.out.println("Cikis icin klavyeden 0 girin");
            System.out.println("Klavyeden bir tam sayi giriniz : ");

            try {
                if (sayi!=0){
                    sayi=Integer.parseInt(klavye.nextLine());
                   // sayi= klavye.nextInt();
                    System.out.println("sayi = " + sayi);
                    toplam+=sayi;
                    System.out.println("toplam = " + toplam);
                }
            }catch (NumberFormatException e){
                System.out.println("Bir hata olustu");
                System.out.println("Lutfen klavyeden bir sayi giriniz.");
            }
            catch (Exception e){
                System.out.println("Sorunlu bir hata bulundu");
            }

        }
    }
}
