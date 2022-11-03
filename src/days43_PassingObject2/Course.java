package days43_PassingObject2;

import java.util.ArrayList;

public class Course {

    String courseName;

    int maxCapacity;
    private int emptyCapacity;

    ArrayList<Student> courseListe = new ArrayList<>();


    Course() {

    }

    Course(String courseName, int maxCapacity) {
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
    }

    public void getEmptyCapacity(){
        System.out.println("Empty capacity of course "+this.courseName);
        System.out.println("-------------------------------------------");
        System.out.println(this.emptyCapacity = maxCapacity - courseListe.size());

    }

    public void addStudentToCourse(Student student) {
        if (this.maxCapacity> courseListe.size()){
            courseListe.add(student);
        }else{
            System.out.println(courseName+" course capacity is full "+" You can not add a new Student");
        }

    }

    public void displayCourseInfo() {
        System.out.println(courseName);
        System.out.println("-----------------");
        for (Student student : courseListe) {
            // System.out.println(student.studentNo+" "+student.name);
            student.displayInfo();
        }
    }
}
