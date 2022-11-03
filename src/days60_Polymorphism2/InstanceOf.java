package days60_Polymorphism2;

import java.util.Date;

public class InstanceOf {

    public static void main(String[] args) {

        /// instanceof(); metodu --> true yada false dondurur.
        Sekil sekil=new Daire();
        if (sekil instanceof Daire){
            System.out.println("Daire");
        }else if(sekil instanceof Kare){
            System.out.println("Kare");
        }else if (sekil instanceof Ucgen){
            System.out.println("Ucgen");
        }

    }
}
