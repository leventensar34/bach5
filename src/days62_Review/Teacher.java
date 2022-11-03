package days62_Review;

public class Teacher extends Employee {

    String schoolName;

    // Constructor overloading
    public Teacher(String name) {
        super(name);
    }

    public Teacher(String name, String schoolName) {
        super(name);
        this.schoolName = schoolName;
    }

    public void work() {
        System.out.println(this.name + " calisiyor.");
    }

    public void doExam() {
        System.out.println(this.name + " teacher is doing exam.");
    }

    public void showInfo() {
        System.out.println("--------Teacher----------");
        System.out.println("Name    :" + this.name);
        System.out.println("School  :" + this.schoolName);
        System.out.println("--------------------------");
    }
}
