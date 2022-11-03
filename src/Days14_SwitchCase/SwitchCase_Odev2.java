package Days14_SwitchCase;


import java.util.Scanner;

public class SwitchCase_Odev2 {

    public static void main(String[] args) {

        /*
        Bir TV uzaktan kumandasında olduğu gibi uzaktan kumandanın sayı tuşlarına(1-10) basıldığını varsayarak
        basılan tuşlara kayıtlı TV kanallarını switch case yapısını kullanarak ekrana yazdıran programı yazınız.

        1.Kanal TRT
        2.Kanal CNN
        ...

        gibi

        Programı test etmek ve çalıştırmak için Scanner Class'ını kullanarak veri girişi yapılabilir.
         */
        Scanner scan = new Scanner(System.in);

        int tusNumber = (int) (Math.random() * 10 + 1);

        String name = "";

        switch (tusNumber) {
            case 1:
                name = " TRT1";
                break;
            case 2:
                name = " CNN";
                break;
            case 3:
                name = " TRT2";
                break;
            case 4:
                name = " TV8";
                break;
            case 5:
                name = " ATV";
                break;
            case 6:
                name = "TGRT";
                break;

            case 7:
                name = " STAR";
                break;

            case 8:
                name = " TRT6";
                break;

            case 9:
                name = " Discovery";
                break;

            case 10:
                name = " Belgesel";
                break;
            default:
                name = "Gecerli bir Kanal bulunamdi!!";

        }
        System.out.println(tusNumber + "."+"Kanal " + name);


    }
}
