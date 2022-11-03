package days55_Composition;

public class Code {

    public static void main(String[] args) {

         /*
          Bu metodu static yaptigimizda , child class inida static yapmamiz lazim.
         Static olmadan  method overrid olur.Fakat static yaptigimizda method hiding olur.
         Method overrid de Child klasindaki degeri alir ve yazdirir,Fakat method hiddingte  Parent class inin degerini yazdirir.
         Child klasinin degerini bir nevi saklamis olur
         */

        Sub sub=new Sub();
       sub.getSuperDescription();



    }
}
