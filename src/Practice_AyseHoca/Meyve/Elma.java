package Practice_AyseHoca.Meyve;

public class Elma implements Meyve {

    double n;
    double kgFiyat=8.5;
    @Override
    public void meyveAdi() {
        System.out.println("Elma");
    }

    @Override
    public void alinanKilo(double n) {
        this.n=n;

    }

    @Override
    public void fiyat() {
        System.out.println("Elmanin fiyati : "+kgFiyat*this.n);
    }
}
