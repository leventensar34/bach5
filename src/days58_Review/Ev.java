package days58_Review;

public class Ev {

    private Salon salon;
    private  YatakOdasi yatakOdasi;
    private YemekOdasi yemekOdasi;
    private Cati cati;
    private Mutfak mutfak;
    private Bahce bahce;

    public Ev(YatakOdasi yatakOdasi, YemekOdasi yemekOdasi, Cati cati, Mutfak mutfak, Bahce bahce) {
        this.yatakOdasi = yatakOdasi;
        this.yemekOdasi = yemekOdasi;
        this.cati = cati;
        this.mutfak = mutfak;
        this.bahce = bahce;
    }

    public Salon getSalon() {
        return salon;
    }

    public YatakOdasi getYatakOdasi() {
        return yatakOdasi;
    }

    public YemekOdasi getYemekOdasi() {
        return yemekOdasi;
    }

    public Cati getCati() {
        return cati;
    }

    public Mutfak getMutfak() {
        return mutfak;
    }

    public Bahce getBahce() {
        return bahce;
    }
}
