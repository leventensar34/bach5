package days62_Review;

public class EmployeeDatabaseTest {

    public static void main(String[] args) {

        EmployeeDatabase database = new EmployeeDatabase();
        Employee employee;

        // database.getList();
        // database.findByName("Ahmet Falanca");
        // database.findByName("Nicola Tesla");

        // System.out.println("database.getSize() = " + database.getSize());

        employee = new Teacher("Hasan Can", "Goethe School of Social Science");
        database.addEmployee(employee);

        // database.getList();

        // database.findByName("Ahmet Falanca").showInfo();

        database.getListNames();
        database.deleteEmployeeByName("Ahmet Falanca");

        database.getListNames();



    }
}
