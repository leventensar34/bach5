package days56_Abstraction;

public abstract class Calisan {


    int id; // calisan numarasi sicil no
    String firstName;
    String ikinciAd="";
    String lastName;


    public String tamAdi() {
        return firstName + " " + ikinciAd + " " + lastName;
    }

    public abstract double aylikMaas();
}
