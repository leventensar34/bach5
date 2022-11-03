package days41_Constructors_passingObjM;

public class Program {

    public static void main(String[] args) {

        SadeKek sadeKek=new SadeKek();

        System.out.println("sadeKek.name = " + sadeKek.name);
        System.out.println("sadeKek.un = " + sadeKek.un);
        System.out.println("sadeKek.seker = " + sadeKek.seker);
        System.out.println("sadeKek.yag = " + sadeKek.yag);

        System.out.println("-------------------------");

        SadeKek sadeKek1=new SadeKek("Sade kek");

        System.out.println("sadeKek1.name = " + sadeKek1.name);
        System.out.println("sadeKek1.un = " + sadeKek1.un);
        System.out.println("sadeKek1.seker = " + sadeKek1.seker);
        System.out.println("sadeKek1.yag = " + sadeKek1.yag);

        SadeKek sadeKek2=new SadeKek("Kakaolu",100,30,20,2,3,4);

        System.out.println("--------------------");

        Oven firin=new Oven();

        firin.tepsi.add(sadeKek1);
        firin.tepsi.add(sadeKek2);

        firin.cook(180,35);

       firin.tepsideNevar();





    }
}
