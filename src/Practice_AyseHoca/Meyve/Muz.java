package Practice_AyseHoca.Meyve;

public class Muz implements Meyve{

    double n;
    double kgFiyat=6.5;
    @Override
    public void meyveAdi() {
        System.out.println("Muz");
    }

    @Override
    public void alinanKilo(double n) {
        this.n=n;

    }

    @Override
    public void fiyat() {
        System.out.println("Muz fiyati : "+kgFiyat*this.n);
    }
}
