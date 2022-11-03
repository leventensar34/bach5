package days62_Review;

import java.util.ArrayList;

public class EmployeeTest {

    public static void eddEmployee(Employee emp,ArrayList array){
        array.add(emp);
        System.out.println("Toplam kayit sayisi : "+array.size());
    }

    public static void main(String[] args) {

        ArrayList<Employee> employees=new ArrayList<>();
        /*
        Teacher teacher=new Teacher("Adem Badem");
        System.out.println("teacher.name = " + teacher.name);
        teacher.work();
        teacher.showInfo();

        System.out.println("------------------");

        Engineer engineer=new Engineer("Ali Can");
        System.out.println("engineer.name = " + engineer.name);
        engineer.work();
        engineer.showInfo();

         */

       /// Polymorphic variable ile tanimlama
        System.out.println("-------------------------");

        Employee employeePlmrc=new Teacher("Mehmet Filanca","Universite");
       // employees.add(employeePlmrc);
        eddEmployee(employeePlmrc,employees); //metodla array liste ekleme

        employeePlmrc.work();
      //  employeePlmrc.showInfo();
        ((Teacher)employeePlmrc).doExam();

        System.out.println("--------------------------");

        employeePlmrc=new Engineer("Ahmet Can","Samsung");
      //  employees.add(employeePlmrc);
        eddEmployee(employeePlmrc,employees); //metodla array liste ekleme


        employeePlmrc.work();
      //  employeePlmrc.showInfo();
        ((Engineer)employeePlmrc).doDesing();

        System.out.println();
        System.out.println("Liste");

        for (Employee emp : employees) {
           // System.out.println("emp.name = " + emp.name);
            emp.showInfo();
            emp.work();
            if (emp instanceof Teacher){
                System.out.println("Name = " + emp.name);
                System.out.println("Hi teacher!");
                ((Teacher)emp).doExam();
            }
            if (emp instanceof Engineer){
                System.out.println("Name = " + emp.name);
                System.out.println("Hi engineer!");
                ((Engineer)emp).doDesing();
            }
        }



    }
}
