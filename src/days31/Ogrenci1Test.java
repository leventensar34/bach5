package days31;

public class Ogrenci1Test {

    public static void main(String[] args) {


        Ogrenci1 faruk = new Ogrenci1();

        faruk.soyIsim = "yanar";
        faruk.matematikNot = 60;
        faruk.okulNo = 667;
        faruk.sinif = 10;

        System.out.println("faruk.sinif = " + faruk.sinif);
        String okulAdi = Ogrenci1.okulAdi;
        System.out.println("okulAdi = " + okulAdi);

        double notortalamasiFaruk = faruk.notortalamasi(60, 70, 80);
        System.out.println("notortalamasiFaruk = " + notortalamasiFaruk);

        Ogrenci1 ogrenci = new Ogrenci1();
        ogrenci.matematikNot = 100;
        ogrenci.Turkce = 90;
        ogrenci.fenBilgisi = 80;
        int matematikNot = ogrenci.matematikNot;
        int turkce = ogrenci.Turkce;
        int fenBilgisi = ogrenci.fenBilgisi;

        double notortalamasiOgrenci = ogrenci.notortalamasi(matematikNot, turkce, fenBilgisi);

        System.out.println("notortalamasiOgrenci = " + notortalamasiOgrenci);
    }
}
