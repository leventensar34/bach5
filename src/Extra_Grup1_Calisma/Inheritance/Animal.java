package Extra_Grup1_Calisma.Inheritance;

public class Animal {

    /*
    1-Inheritance -->miras demektir
    2-Parent-->Super, Child-->Sub kavramlari mevcuttur.
    3-Extends keeyword ile yapilir
    4-Ana klastan bir sey cagrilirken yani metod yada cons. super keyword ile cagrilir
    5-bir metod icinde parent dan bir seyi super ile cagiririz.Ama her zaman ilk sirada yazmamiz lazim
     */

    public Animal() {

        System.out.println("Animal Parent class cons.");
    }
    public void eat(){
        System.out.println("Hayvanlar yemek yer");
    }
    public void nefesAl(){
        System.out.println("Hayvanlar nefes alir");
    }
}
