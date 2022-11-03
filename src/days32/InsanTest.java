package days32;

public class InsanTest {

    public static void main(String[] args) {

        Insan ali = new Insan();
        ali.kilo = 80;
        ali.memleket = "Ankara";
        ali.yas = 40;
        ali.soyIsim = "ozcan";


        Insan veli = new Insan();
        veli.soyIsim = "toprak";
        veli.yas = 20;
        veli.kilo = 100;
        veli.memleket = "istanbul";


        ali.sporYapiyor();
        veli.yemekYiyor();
        System.out.println("veli.kilo = " + veli.kilo);
        System.out.println("ali.kilo = " + ali.kilo);

    }
}
