package ExtraSelbst1;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int num1,num2,secim;

        System.out.println("Birinci sayi giriniz: ");
        num1= scan.nextInt();
        System.out.println("Ikinci sayiyi giriniz: ");
        num2= scan.nextInt();
        System.out.println("\nLutfen yapmak istrdiginiz islemi seciniz: ");
        System.out.println("1-Toplama\n 2-Cikarma\n 3-Carpma\n 4-Bolme ");
        System.out.println("Seciminiz: ");
        secim= scan.nextInt();

        if (secim==1){
            System.out.println("Toplama : "+(num1+num2));
        } else if (secim==2) {
            System.out.println("Cikarma : "+(num1-num2));
        } else if (secim==3) {
            System.out.println("Carpma : "+(num1*num2));
        } else if (secim==4) {
            if (num2==0){
                System.out.println("Ikinci sayi sifirdir ve sonuc belirsizdir");
            }else{
                System.out.println("Bolme : "+(num1/num2));
            }
        }else{
            System.out.println("Gecersiz bir islem girdiniz ");
        }

    }


}
