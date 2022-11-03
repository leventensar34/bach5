package days63;

public abstract class Sekiller {

    int kenarUzunlugu;

    String name;


    public Sekiller() {

    }

    public abstract int alanHesaplama();

    public void ciziyoruz() {
        System.out.println(name+" ciziyoruz");

    }

}
