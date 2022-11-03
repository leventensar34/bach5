package Extra_Grup1_Calisma.Proje_Class;

public class SDET1 {

    String name;
    int age;
    char gender;
    String company;
    double salary;
    boolean isSuccessfull;


    public SDET1() {
        this.isSuccessfull = true;
    }

    public void inceaseSalary(double raiseAmount) {

        this.salary += raiseAmount;
        System.out.println("Maasiniz " + raiseAmount + " kadar arttirildi");

    }

    public void companyChange(String newCompany) {

        this.company = newCompany;
        System.out.println(newCompany + " sirketine yerlestiniz. Hayirli olsun");

    }

    @Override
    public String toString() {
        return "SDET1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", isSuccessfull=" + isSuccessfull +
                '}';
    }
}
