package days42_Review;

public class OtoparkProgram {

    public static void main(String[] args) {

        Otopark otopark1 = new Otopark();
        otopark1.name = "ABC otoparki";
        otopark1.address = "Falanca yerdeki otopark no=12";
        otopark1.capacity = 100;

        Araba araba1 = new Araba();
        araba1.marka = "Honda";
        araba1.plateNumber = "06ABC007";

        Araba araba2 = new Araba();
        araba2.marka = "Audi";
        araba2.plateNumber = "FAA345";


        Araba araba3 = new Araba();
        araba3.marka = "BMW";
        araba3.plateNumber = "ABC123";


        otopark1.bosAracKapasite();
        otopark1.otoparkaGiris(araba1);
        otopark1.otoparkaGiris(araba2);
        otopark1.otoparkaGiris(araba3);

        otopark1.otoparkAracListe();
        otopark1.bosAracKapasite();

        otopark1.otoparkaCikis(araba1);
        otopark1.bosAracKapasite();
        otopark1.otoparkaCikis(araba3);
        otopark1.otoparkAracListe();
        otopark1.bosAracKapasite();

        otopark1.searchByPlateNumber("FAA345");
        otopark1.searchByPlateNumber("ABC123");


    }
}
