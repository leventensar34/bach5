package days56_Abstraction;

public class KadroluCalisan extends Calisan {
  /*
    int id; // calisan numarasi sicil no
    String firstName;
    String lastName;

   */

    double yillikMaas;
  /*
    public String tamAdi() {
        return firstName + " " + lastName;
    }

   */

    public double aylikMaas() {
        return yillikMaas / 12;
    }


}
