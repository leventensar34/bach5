package days58_Review2;

public class Ev {

    private  String isim;
    private Oda oda1;
    private Oda oda2;
    private Oda oda3;
    private Oda oda4;
    private Cati cati;
    private Mutfak mutfak;
    private Bahce bahce;

    public Ev(String bahceli_ev, Oda oda1, Oda oda2, Oda oda3, Oda oda4, Cati cati, Mutfak mutfak, Bahce bahce) {
        this.oda1 = oda1;
        this.oda2 = oda2;
        this.oda3 = oda3;
        this.oda4 = oda4;
        this.cati = cati;
        this.mutfak = mutfak;
        this.bahce = bahce;
    }
    public void kapiAc(){
        System.out.println("Kapi aciliyor....");
    }

    public Oda getOda1() {
        return oda1;
    }

    public Oda getOda2() {
        return oda2;
    }

    public Oda getOda3() {
        return oda3;
    }

    public Oda getOda4() {
        return oda4;
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
