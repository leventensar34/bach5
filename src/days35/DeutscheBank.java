package days35;

public class DeutscheBank {

    public static void main(String[] args) {

        Banka hesap1 = new Banka();

        hesap1.hesapNo = 1234566789;
        hesap1.hesapSahibi = "Hans Danke";
        hesap1.bakiye = 100;

        System.out.println(hesap1.hesapNo);
        System.out.println(hesap1.hesapSahibi);
        System.out.println(hesap1.bakiye);

        hesap1.paraYatirma(300);

        hesap1.bakiyeGoster();

        hesap1.paraCekme(150);

        hesap1.bakiyeGoster();

        hesap1.SatinAl(120, "telefon");

        hesap1.bakiyeGoster();


    }
}
