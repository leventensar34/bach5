package days52;

public class Sdet_Test {

    public static void main(String[] args) {

        SDET muratBey = new SDET();
        muratBey.company = "Amazon";
        System.out.println("muratBey.company = " + muratBey.company);
        muratBey.salary = 90000;
        muratBey.age = 40;
        muratBey.gender = 'M';
        muratBey.name = "Murat Bey";
        System.out.println("muratBey.salary = " + muratBey.salary);

        muratBey.companyChange("Google");
        System.out.println("muratBey.company = " + muratBey.company);
        muratBey.increaseSalary(30000);
        System.out.println("muratBey.salary = " + muratBey.salary);

        /////////////////
        System.out.println("----------------");
        SDET betlulHanim = new SDET("Betul Hanim", 27, 'F', "Porche", 100000, true);

        System.out.println("betlulHanim.company = " + betlulHanim.company);

        betlulHanim.companyChange("Facebook");
        System.out.println("betlulHanim.company = " + betlulHanim.company);
        betlulHanim.increaseSalary(10000);
        System.out.println("betlulHanim.salary = " + betlulHanim.salary);


    }
}
