package days56_Abstraction;

public class SaatlikCalisan extends Calisan {

 /*
    int id;
    String firstName;
    String lastName;

  */

    double saatUcreti;
    int toplamCalismaSaati;

  /*
    public String tamAdi() {
        return firstName + " " + lastName;
    }

   */

    public double aylikMaas() {
        return saatUcreti * toplamCalismaSaati;
    }
}
