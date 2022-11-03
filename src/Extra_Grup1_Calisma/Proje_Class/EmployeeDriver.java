package Extra_Grup1_Calisma.Proje_Class;

public class EmployeeDriver {

    public static void main(String[] args) {

        Employee person1 = new Employee("Elif Hanim", 50000, 45, 2003);

        person1.toString(person1);

        System.out.println("--------------------");

        Employee person2=new Employee("Feride Hanim",70000,42,2004);
        person2.toString(person2);

        System.out.println("--------------------");
        Employee person3=new Employee("Sehmuz Bey",48000,47,2008);
        person3.toString(person3);

    }

}
