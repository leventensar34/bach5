package ExtraSelbst2;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Kemal", 2000.0, 45, 1985);
        emp1.toString(emp1);

        System.out.println("---------------");
        Employee emp2=new Employee("Ali",3000.0,55,1980);
        emp2.toString(emp2);
    }
}
