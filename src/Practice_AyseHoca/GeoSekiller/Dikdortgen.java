package Practice_AyseHoca.GeoSekiller;

public class Dikdortgen extends Hesaplamalar {

    int en;
    int boy;

    public Dikdortgen(int deger1, int deger2) {
        super(deger1, deger2);
    }

    @Override
    public int alanHesaplama() {
        return deger1*deger2;
    }

    @Override
    public int cevreHesaplama() {
        return 2*(deger1+deger2);
    }

    @Override
    public String showInfo() {
        return super.showInfo();
    }
}
