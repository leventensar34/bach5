package days63;

public class SekillerTest {

    public static void main(String[] args) {


        /* Not:
        1- Abstract da obje olusturulamaz
        2-Abstract class ini inherite ederek kullaniriz
        3-Abstrackt method sadece abstract class in icinde kullanilir ve body si yoktur
        4-Soyut metodlar Abstract class inda olur ve onlari Sub classs da implement ederiz
        5-Abstract class inda kendine ait const. bulunur
         */
        // Sekiller sekil = new Sekiller(); //Abstract da obje olusturulamaz


        Kare kare = new Kare(10);
       // kare.kenarUzunlugu = 10;
        kare.name="Kare";
        int kareAlan = kare.alanHesaplama();
     //   System.out.println("kareAlan = " + kareAlan);

        Kare kare2 = new Kare(5);
      //  kare2.kenarUzunlugu = 5;
       int kare2Alan=kare2.alanHesaplama();
      //  System.out.println("kare2Alan = " + kare2Alan);

        kare.ciziyoruz();

    }
}
