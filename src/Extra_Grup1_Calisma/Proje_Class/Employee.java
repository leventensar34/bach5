package Extra_Grup1_Calisma.Proje_Class;

public class Employee {

    String name;

    double salary;

    int workHours, hireYear;


    public Employee(String name, double salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary > 1000) {
            return salary * 0.03;
        } else {
            return 0.0;
        }
    }

    public double bonus() {
        int extraHours;
        extraHours = workHours - 40;
        return extraHours * 30;
    }

    public double incrase() {
        int workYear = 2022 - hireYear;
        if (workYear < 10) {
            return salary * 0.05;
        } else if (workYear < 20 && workYear > 9) {
            return salary*0.10;
        }else {
            return salary*0.15;
        }
    }

    public void toString(Employee person){
        System.out.println("Name: "+person.name);
        System.out.println("Tax: "+person.tax());
        System.out.println("Bonus: "+person.bonus());
        System.out.println("Incrase: "+person.incrase());
    }
}
