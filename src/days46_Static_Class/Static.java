package days46_Static_Class;


class Deneme {

    public void deneme() {
        System.out.println();
        System.out.println("Static.number = " + Static.number);
    }

    public static void denemeStatic() {
        System.out.println("Deneme class static method called");
    }
}

public class Static {

    /*
    Not:
    1- Static tanimlanmis degerler ve metodlar obje olusturulmadan direk cagrilabilir.
    2- Static olarak tanimlanmamis degerler ise anacak bir obje olusturularak kullanilir.
     */


    public static int number;
    int number1;

    public static void main(String[] args) {
        Deneme dnm = new Deneme();

        Static stc = new Static();
        Static stc1 = new Static();
        Static stc2 = new Static();
        Static stc3 = new Static();
        Static stc4 = new Static();
        Static stc5 = new Static();

        Static.number = 10;
        dnm.deneme();
        Deneme.denemeStatic();


        stc.number1 = 1;
        stc1.number1 = 5;
        stc2.number1 = 10;

        System.out.println("stc.number1 = " + stc.number1);
        System.out.println("stc1.number1 = " + stc1.number1);
        System.out.println("stc2.number1 = " + stc2.number1);

        {
            System.out.println("Deneme");    //iki parantes arasia  blok denir
            System.out.println("Deneme123");
        }



    }
}
