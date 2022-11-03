package days62;

public class Marsupial {

    public  boolean isBiped() {
        /*
          Bu metodu static yaptigimizda , child class inida static yapmamiz lazim.
         Static olmadan  method overrid olur.Fakat static yaptigimizda method hiding olur.
         Method overrid de Child klasindaki degeri alir ve yazdirir,Fakat method hiddingte  Parent class inin degerini yazdirir.
         Child klasinin degerini bir nevi saklamis olur
         */
        return false;
    }

    public void getMarsupialDescription(){
        System.out.println("Marsupilian walks on the two legs : "+isBiped());
    }
}
