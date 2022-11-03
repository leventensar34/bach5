package days32;

public class Futbolcu {

    int yas;
    String soyIsim;
    int formaNo;
    String kulup;
    String mevki;
    static String ulke = "Fransa";
    int sahsiGol;

    static int takimGol;


    public void takimGolAtti() {
        takimGol++;  // statik degisken
    }

    public void sahisGolAtti(){
        sahsiGol++;  // objecte degisken
    }


}
