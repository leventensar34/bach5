package days31;

public class OgrenciTest {

    public static void main(String[] args) {


        Ogrenci Serkan = new Ogrenci();

        Serkan.gozRengi = "yesil";
        Serkan.sacRengi = "kahverengi";
        Serkan.uyruk = "Alm";
        Serkan.cinsiyet = 'm';
        Serkan.yas = 35;
        Serkan.boy = 165;
        Serkan.kilo=67;

        System.out.println("Serkan.gozRengi = " + Serkan.gozRengi);
        System.out.println("Serkan.sacRengi = " + Serkan.sacRengi);
        System.out.println("Serkan.uyruk = " + Serkan.uyruk);
        System.out.println("Serkan.cinsiyet = " + Serkan.cinsiyet);
        System.out.println("Serkan.yas = " + Serkan.yas);
        System.out.println("Serkan.boy = " + Serkan.boy);
        System.out.println("Serkan.kilo = " + Serkan.kilo);


    }
}
