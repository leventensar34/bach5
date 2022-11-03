package days62_Review;

public abstract class Employee {

    String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract void work();

    public abstract void showInfo();
}
