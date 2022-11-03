package days63;

public class Kare extends Sekiller {

    static int olusturulanObjeNo;

    public Kare(int kenar) {
       this.kenarUzunlugu=kenar;
        olusturulanObjeNo++;
    }

    @Override
    public int alanHesaplama() {

        int alan = kenarUzunlugu * kenarUzunlugu;
        System.out.println(olusturulanObjeNo+". sirada olusturulan karenin alani = " + alan);
        return alan;
    }

    @Override
    public void ciziyoruz() {
        System.out.println(name+" boyuyoruz");
    }
}
