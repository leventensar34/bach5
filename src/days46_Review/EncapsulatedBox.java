package days46_Review;

public class EncapsulatedBox {

    private int en;
    private int boy;
    private int yukseklik;
    private int hacim;

    public EncapsulatedBox() {
        en = 1;
        boy = 1;
        yukseklik = 1;

    }

    public EncapsulatedBox(int en, int boy, int yukseklik) {
        this.en = en;
        this.boy = boy;
        this.yukseklik = yukseklik;
    }

    public void degerataEn(int yeniDeger) {
        this.en = yeniDeger;
    }

    public void setEn(int en) {
        this.en = en;

    }

    public int degerOku() {
        return en;
    }

    public int getEn() {
        deneme();
        return en;
    }

    private void deneme() {
        System.out.println("Bu metoda sadece class icerisindekiler ulasabilir ");
    }

    private void hacimHesapla() {
        hacim = this.en * this.boy * this.yukseklik;
    }

    public int getHacim() {
        hacimHesapla();
        return hacim;
    }
}
