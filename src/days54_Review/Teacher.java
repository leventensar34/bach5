package days54_Review;

public class Teacher extends Person {

    String lessonGiven;

    public void showTeacher(){
        System.out.println("Teacher...");
        System.out.println("Teacher number is   : " + personId);
        System.out.println("Teacher name is     : " + name);
        System.out.println("Teacher Lesson      : " + lessonGiven);
    }

}
