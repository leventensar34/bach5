package days46_Static_Class;

public class OgrenciTest {

    public static void main(String[] args) {


        Ogrenci ogr1 = new Ogrenci();
        ogr1.ad = "Ahmet";
        ogr1.soyad = "Falanca";


        Ogrenci ogr2 = new Ogrenci();
        ogr2.ad = "Jhon";
        ogr2.soyad = "Smith";

        Ogrenci ogr3 = new Ogrenci("Ali");


        System.out.println("ogr1.toString() = " + ogr1.toString());
        System.out.println("ogr2.toString() = " + ogr2.toString());
        System.out.println("ogr3.toString() = " + ogr3.toString());


    }
}
