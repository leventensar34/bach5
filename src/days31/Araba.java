package days31;

public class Araba {

    String marka;
    int yil;
    boolean otomatik;
    boolean manuel;
    int kapi;
    String renk;
    double motorHacmi;
    static boolean sigorta = true;

    public static void main(String[] args) {
        Araba toyota = new Araba();
        toyota.kapi = 2;
        toyota.yil = 2020;
        toyota.otomatik = true;
        toyota.motorHacmi = 1.6;
        toyota.renk = "mavi";
        boolean sigorta1 = Araba.sigorta;
        System.out.println("toyota.kapi = " + toyota.kapi);
        System.out.println("toyota.yil = " + toyota.yil);
        System.out.println("toyota.otomatik = " + toyota.otomatik);
        System.out.println("toyota.renk = " + toyota.renk);
        System.out.println("toyota.motorHacmi = " + toyota.motorHacmi);



    }
}