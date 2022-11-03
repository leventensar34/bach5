package days32;

public class FutbolcuTest {

    public static void main(String[] args) {


        Futbolcu messi = new Futbolcu();
        messi.kulup = "Psg";
        messi.formaNo = 30;
        messi.soyIsim = "gonzales";
        messi.yas = 34;
        messi.mevki = "ortasaha";
        System.out.println("messi.sahsiGol = " + messi.sahsiGol);

        Futbolcu ronaldo = new Futbolcu();
        ronaldo.yas = 36;
        ronaldo.kulup = "juventus";
        ronaldo.mevki = "forvet";
        ronaldo.soyIsim = "henry";
        System.out.println("ronaldo.sahsiGol = " +ronaldo.sahsiGol);

        System.out.println("messi.kulup = " + messi.kulup);
        System.out.println("ronaldo.kulup = " + ronaldo.kulup);

        Futbolcu mpb = new Futbolcu();
        mpb.soyIsim = "pel";
        mpb.yas = 25;
        mpb.formaNo = 7;
        mpb.mevki = "defans";
        System.out.println("mpb.sahsiGol = " + mpb.sahsiGol);

        System.out.println("mpb.mevki = " + mpb.mevki);

        System.out.println("Futbolcu.takimGol = " + Futbolcu.takimGol);
        messi.takimGolAtti();
        System.out.println("Futbolcu.takimGol = " + Futbolcu.takimGol);

        mpb.takimGolAtti();
        System.out.println("Futbolcu.takimGol = " + Futbolcu.takimGol);
        messi.takimGolAtti();
        System.out.println("Futbolcu.takimGol = " + Futbolcu.takimGol);
        System.out.println("Futbolcu.ulke = " + Futbolcu.ulke);

        messi.sahisGolAtti();
        messi.sahisGolAtti();
        System.out.println("messi.sahsiGol = " + messi.sahsiGol);

        mpb.sahisGolAtti();
        System.out.println("mpb.sahsiGol = " + mpb.sahsiGol);


    }

}
