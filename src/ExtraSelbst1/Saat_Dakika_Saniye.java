package ExtraSelbst1;

import java.util.Scanner;

public class Saat_Dakika_Saniye {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen saniye sayisini giriniz: ");
      int seconds= scan.nextInt();

      int hour,minutes;
     hour=seconds/3600;
     minutes=(seconds/60)%60;
     seconds=(seconds%60);

        System.out.println(hour+" hours, "+minutes+" minutes, and "+seconds+" seconds");
    }

}

