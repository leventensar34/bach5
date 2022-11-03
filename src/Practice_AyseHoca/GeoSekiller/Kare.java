package Practice_AyseHoca.GeoSekiller;

public class Kare extends Hesaplamalar {

    int kenarUzunlugu;

    public Kare(int deger1, int deger2) {
        super(deger1, deger2);
    }

    @Override
    public int alanHesaplama() {
        return deger1*deger1;
    }

    @Override
    public int cevreHesaplama() {
        return 4*deger1;
    }

    @Override
    public String showInfo() {
        return super.showInfo();
    }
}
