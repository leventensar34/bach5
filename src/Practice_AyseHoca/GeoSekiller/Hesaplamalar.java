package Practice_AyseHoca.GeoSekiller;

public abstract class Hesaplamalar {
  public   int deger1;
  public   int deger2;

    public Hesaplamalar(int deger1, int deger2) {
        this.deger1 = deger1;
        this.deger2 = deger2;
    }

    public   abstract int alanHesaplama();

  public abstract int cevreHesaplama();


    public String showInfo() {
        return "Hesaplamalar{" +
                "deger1=" + deger1 +
                ", deger2=" + deger2 +
                '}';
    }
}
