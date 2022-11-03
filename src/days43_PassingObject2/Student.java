package days43_PassingObject2;

public class Student {

    int studentNo;

    String name;

    public Student(int studentNo, String name) {
        this.studentNo = studentNo;
        this.name = name;
    }


    public void displayInfo() {
        System.out.println(this.studentNo + " " + this.name);
    }
}
