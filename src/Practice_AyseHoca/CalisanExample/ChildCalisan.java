package Practice_AyseHoca.CalisanExample;

public class ChildCalisan extends Calisan{

    String okul;
    int yas;

    public ChildCalisan() {
        super();
    }

    public ChildCalisan(String okul, int yas) {
        this.okul = okul;
        this.yas = yas;
    }

    @Override
    public String birlestir(String ad, String soyad) {
        return super.birlestir(ad, soyad);
    }

    @Override
    public int getDogumYili(int dogumYili) {
        return super.getDogumYili(dogumYili);
    }
}
