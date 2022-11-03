package days50;

public class Hesaplar {


    public static void main(String[] args) {


        TlhBank ensarEuroHesap=new TlhBank();

        System.out.println("ensarEuroHesap.bankaAdi = " + ensarEuroHesap.bankaAdi);
        System.out.println("ensarEuroHesap.hesapAktifmi = " + ensarEuroHesap.hesapAktifmi);
        System.out.println("ensarEuroHesap.hesapSahibi = " + ensarEuroHesap.hesapSahibi);

        ensarEuroHesap.hesapSahibi="Ensari Levent";
        ensarEuroHesap.hesapNo=100001;
        ensarEuroHesap.hesapTuru="Vadeli";
        ensarEuroHesap.bakiye=1000;
        ensarEuroHesap.karOrani=0.10;
        ensarEuroHesap.paraBirimi="EUR";
        ensarEuroHesap.subeAdres="Van";

        TlhBank ensarPoundHesap=new TlhBank();
        ensarPoundHesap.hesapSahibi="Ensari Levent";
        ensarPoundHesap.hesapNo=100002;
        ensarPoundHesap.hesapTuru="Vadeli";
        ensarPoundHesap.bakiye=2000;
        ensarPoundHesap.karOrani=0.20;
        ensarPoundHesap.paraBirimi="GBP";
        ensarPoundHesap.subeAdres="London";







    }
}
