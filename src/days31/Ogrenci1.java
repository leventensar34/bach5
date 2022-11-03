package days31;

public class Ogrenci1 {

    String soyIsim;
    int sinif;
    int matematikNot;
    int Turkce;
    int fenBilgisi;
    int okulNo;
    double notOrtalamasi;
    static String okulAdi = "Merkez ortaokulu";


    public double notortalamasi(int matematikNot, int Turkce, int fenBilgisi) {
        double notort = (matematikNot + Turkce + fenBilgisi) / 3;

        return notort;

    }


    public static void main(String[] args) {
        System.out.println("okulAdi = " + okulAdi);
        Ogrenci1 ali = new Ogrenci1();
        ali.soyIsim = "toprak";
        ali.sinif = 8;
        ali.okulNo = 595;
        ali.matematikNot = 80;
        System.out.println("ali.sinif = " + ali.sinif);
        System.out.println("ali.okulNo = " + ali.okulNo);
        System.out.println("ali.soyIsim = " + ali.soyIsim);
        System.out.println("ali.matematikNot = " + ali.matematikNot);

        System.out.println("----------------");

        Ogrenci1 veli = new Ogrenci1();

        veli.soyIsim = "guzel";
        veli.okulNo = 500;
        veli.matematikNot = 75;
        veli.notOrtalamasi = 65.0;
        veli.sinif = 10;

        System.out.println("veli.soyIsim = " + veli.soyIsim);
        System.out.println("veli.matematikNot = " + veli.matematikNot);
        System.out.println("veli.sinif = " + veli.sinif);
        System.out.println("veli.okulNo = " + veli.okulNo);
        System.out.println("veli.notOrtalamasi = " + veli.notOrtalamasi);


    }


}
