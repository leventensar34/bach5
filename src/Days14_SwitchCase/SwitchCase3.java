package Days14_SwitchCase;

import java.util.Scanner;

public class SwitchCase3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int num;
        System.out.print("Lutfen bir sayi giriniz: ");
        num= scan.nextInt();

        String month="";
        String hangiMevsim="";
        switch (num){
            case 1:
                month="Ocak";
                break;
              case 2:
                month="Subat";
                break;
              case 3:
                month="Mart";
                break;
              case 4:
                month="Nisan";
                break;
              case 5:
                month="Mayis";
                break;
              case 6:
                month="Haziran";
                break;
              case 7:
                month="Temmuz";
                break;
              case 8:
                month="Agustos";
                break;
              case 9:
                month="Eylul";
                break;
              case 10:
                month="Ekim";
                break;
              case 11:
                month="Kasim";
                break;
              case 12:
                month="Aralik";
                break;
            default:
                month="Gecersiz bir sayi girdiniz!!";

        }
        System.out.println("month = " + month);
        switch (num){
            case 12: case 1: case 2:
                hangiMevsim="Kis ayidir";
                break;
                    case 3: case 4: case 5:
                hangiMevsim="Ilkbahar ayidir";
                break;
                    case 6: case 7: case 8:
                hangiMevsim="Yaz ayidir";
                break;
                    case 9: case 10: case 11:
                hangiMevsim="Sonbahar ayidir";
                break;
            default:
                hangiMevsim="Gecersiz bir ay girdiniz";

        }
        System.out.println(month+" = " + hangiMevsim);
    }
}
