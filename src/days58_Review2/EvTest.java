package days58_Review2;

public class EvTest {

    public static void main(String[] args) {

        Oda oda1=new Oda("Oturma odasi","Sari");
        Oda oda2=new Oda("Misafir odasi","Kirmizi");
        Oda oda3=new Oda("Cocuk odasi","Mor");
        Oda oda4=new Oda("Salon","Mavi");

        Cati cati=new Cati(10.5,"Kahverengi");
        Mutfak mutfak=new Mutfak("Amerikan",20,"MDF","Fayans");
        Bahce bahce=new Bahce("Cim","Demir","Elektrikli",true);


        Ev ev=new Ev("Bahceli ev",oda1,oda2,oda3,oda4,cati,mutfak,bahce);


        ev.kapiAc();
        ev.getCati().tut();
        ev.getMutfak().yemekYap();
        ev.getBahce().sula();
        System.out.println(ev.getOda1().getNeOdasi());
        System.out.println("Havuz varmi? " + ev.getBahce().isHavuzVarmi());


    }
}
