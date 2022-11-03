package days55_Composition.Bilgisayar_Has_a;

public class Monitor {

    private String model;
    private String uretici;
    private int ekranBoyutu;
    private Cozunurluk cozunurlik;

    public Monitor(String model, String uretici, int ekranBoyutu, Cozunurluk cozunurlik) {
        this.model = model;
        this.uretici = uretici;
        this.ekranBoyutu = ekranBoyutu;
        this.cozunurlik = cozunurlik;
    }

    public String getModel() {
        return model;
    }

    public String getUretici() {
        return uretici;
    }

    public int getEkranBoyutu() {
        return ekranBoyutu;
    }

    public Cozunurluk getCozunurlik() {
        return cozunurlik;
    }
}
