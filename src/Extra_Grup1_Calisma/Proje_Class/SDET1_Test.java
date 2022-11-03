package Extra_Grup1_Calisma.Proje_Class;

public class SDET1_Test {

    public static void main(String[] args) {

        SDET1 ferideHanim=new SDET1();
        ferideHanim.name="Feride";
        ferideHanim.age=28;
        ferideHanim.gender='F';
        ferideHanim.company="Google";
        ferideHanim.salary=60000;
        ferideHanim.isSuccessfull=true;

        System.out.println(ferideHanim.toString()); // Toplu yazdirmak istersek toString(); metodunu kullanilir.

        System.out.println("--------------------");
        System.out.println("ferideHanim.name = " + ferideHanim.name);
        System.out.println("ferideHanim.age = " + ferideHanim.age);
        System.out.println("ferideHanim.gender = " + ferideHanim.gender);
        System.out.println("ferideHanim.company = " + ferideHanim.company);
        System.out.println("ferideHanim.salary = " + ferideHanim.salary);
        System.out.println("ferideHanim.isSuccessfull = " + ferideHanim.isSuccessfull);

        System.out.println("------------------------------");
        ferideHanim.companyChange("Avsar");
        System.out.println("ferideHanim.company = " + ferideHanim.company);
        ferideHanim.inceaseSalary(10000);
        System.out.println("ferideHanim.salary = " + ferideHanim.salary);

        System.out.println("-------------");
        SDET1 sehmuzBey=new SDET1();
        sehmuzBey.name="Sehmuz";
        System.out.println("sehmuzBey.name = " + sehmuzBey.name);

    }
}
