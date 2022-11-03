package days35;

public class Banka {

    double bakiye;
    String hesapSahibi;
    int hesapNo;

    public void paraYatirma(double miktar) {


        System.out.println(hesapNo + " nolu hesabiniza " + miktar + " $ para yatirilmistir");
        bakiye += miktar;
    }

    public void paraCekme(double miktar) {
        System.out.println(hesapNo + " nolu hesabiniza " + miktar + " $ para cekilmistir");
        bakiye -= miktar;

    }

    public void bakiyeGoster() {

        System.out.println("------Hesap Ozeti-------");
        System.out.println("Hesap sahibi: " + hesapSahibi);
        System.out.println("Hesap no: " + hesapNo);
        System.out.println("Bakiye: " + bakiye);
        System.out.println("-------------------------");


    }

    public void SatinAl(double fiyat, String urun) {
        if (bakiye >= fiyat) {
            System.out.println(hesapNo + " sayili hesaptan " + urun + " isimli urunu " + fiyat + " fiyata satin alinmistir ");
            bakiye -= fiyat;
        } else {
            System.out.println("Yetersiz Bakiye");
        }
    }

}
