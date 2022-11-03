package days62_Review;

import java.util.ArrayList;

public class EmployeeDatabase {

    private ArrayList<Employee> employees;

    public EmployeeDatabase() {
        employees = new ArrayList<>();
        addTestRecords();
    }

    public void addEmployee(Employee elemen) {
        employees.add(elemen);
    }

    public void deleteEmployeeByName(String name) {
        employees.remove(findByName(name));

    }

    public Employee findByName(String name) {

        for (Employee eleman : employees) {
            if (name.equals(eleman.name)) {
                // eleman.showInfo();
                return eleman;
            }
        }
        System.out.println("Kayit bulunamadi");
        return null;
    }

    public int getSize() {
        return employees.size();
    }

    public void getListNames() {
        System.out.println("Veri tabaninda kayitli olan kisilerin listesi");
        System.out.println("---------------------------------------------");
        int sayac = 0;
        for (Employee eleman : employees) {
            sayac++;
            System.out.print(sayac + "-"+eleman.name + "-");
            if (eleman instanceof Teacher) {
                System.out.println(((Teacher) eleman).schoolName);
            }
            if (eleman instanceof Engineer) {
                System.out.println(((Engineer) eleman).workPlace);
            }

        }
        System.out.println("\nToplam kayit sayisi : " + getSize());
    }

    public void getList() {
        for (Employee eleman : employees) {
            eleman.showInfo();
        }
    }

    private void addTestRecords() {
        Employee employee = new Teacher("Jhone Smith", "University of New York");
        employees.add(employee);

        employee = new Engineer("Nicola Tesla", "Tesla");
        employees.add(employee);

        employee = new Teacher("Ahmet Falanca", "Ankara Universitesi");
        employees.add(employee);

        employee = new Engineer("Ayse Hanim", "EuroTech Education");
        employees.add(employee);


    }
}
