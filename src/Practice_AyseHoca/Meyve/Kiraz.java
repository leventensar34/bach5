package Practice_AyseHoca.Meyve;

public class Kiraz implements Meyve{

    double n;
    double kgFiyat=10.5;
    @Override
    public void meyveAdi() {
        System.out.println("Kiraz");
    }

    @Override
    public void alinanKilo(double n) {
        this.n=n;

    }

    @Override
    public void fiyat() {
        System.out.println("Kiraz fiyati : "+kgFiyat*this.n);
    }
}
