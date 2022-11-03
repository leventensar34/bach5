package Extra_Grup1_Calisma.OOP_Animal;

public class Kedi extends Hayvan {

    private int disSayisi;

    public Kedi(String isim, int kilo, int boy, int bacakSayisi, int disSayisi) {
        super(isim, kilo, boy, bacakSayisi);
        this.disSayisi = disSayisi;
    }

    @Override
    public void hareketeGec(int hiz) {
        super.hareketeGec(hiz);
    }

    public void kos(int hiz) {
        System.out.println("Kedi kosuyor");
        hareketeGec(hiz);
    }

    public int getDisSayisi() {
        return disSayisi;
    }

    public void setDisSayisi(int disSayisi) {
        this.disSayisi = disSayisi;
    }

}
