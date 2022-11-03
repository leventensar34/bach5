package days54_Review;

public class Student extends Person {

    //  public class Student extends Person,Employee
    // Java does not extends multiple class
    String schoolName;
    String bolumAd;
    public void showInfoStudent(){
        System.out.println("Student number is   : " + personId);
        System.out.println("Student name is     : " + name);
        System.out.println("Student School Name : " + schoolName);
        System.out.println("Student Bolum Adı   : " + bolumAd);
    }
}
