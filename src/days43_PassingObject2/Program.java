package days43_PassingObject2;

public class Program {

    public static void main(String[] args) {


        System.out.println("Test");

        Course euroTechJava = new Course("Java", 15);

        Course euroTechSDET = new Course("SDET", 3);

        Student std1 = new Student(1001, "Ali Can");
        Student std2 = new Student(1005, "Ahmet Falanca");
        Student std3 = new Student(1401, "Jhon Smith");
        Student std4 = new Student(1561, "Elizabeth Taylor");
        Student std5 = new Student(3401, "Fatma Gul");

        euroTechJava.addStudentToCourse(std1);
        euroTechJava.addStudentToCourse(std2);
        euroTechJava.addStudentToCourse(std3);

        euroTechSDET.addStudentToCourse(std1);
        euroTechSDET.addStudentToCourse(std4);
        euroTechSDET.addStudentToCourse(std5);
        euroTechSDET.addStudentToCourse(std3);

        euroTechJava.getEmptyCapacity();
        euroTechSDET.getEmptyCapacity();


        std1.displayInfo();
        euroTechJava.displayCourseInfo();

        euroTechSDET.displayCourseInfo();


    }

}
