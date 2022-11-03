package days52;

public class Student {

    String name;

    int age;

    long studentNo;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(long studentNo) {
        this.studentNo = studentNo;
    }

    public Student(String name, int age, long studentNo) {
        this.name = name;
        this.age = age;
        this.studentNo = studentNo;
    }

    public static void main(String[] args) {


        Student s1 = new Student("Talha");

        Student s2 = new Student("Tuna", 34);

        Student s3 = new Student(123456678);

    }


}
