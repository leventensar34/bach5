package days52;

public class SDET {

    String name;
    int age;
    char gender;
    String company;
    double salary;
    boolean isSuccesful;

    public SDET() {  //Default Constructure
        this.isSuccesful = true;
    }

    public SDET(String name, int age, char gender, String company, double salary, boolean isSuccesful) {
        this();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.salary = salary;
        this.isSuccesful = isSuccesful;
    }

    public void increaseSalary(double raiseAmount) {
        this.salary += raiseAmount;
        System.out.println("Maasiniza " + raiseAmount + " kadar zam yapildi.Tebrikler");

    }

    public void companyChange(String newCompany) {
        this.company = newCompany;
        System.out.println("Yeni firmaniz " + newCompany + " hayirli olsun");

    }

}
