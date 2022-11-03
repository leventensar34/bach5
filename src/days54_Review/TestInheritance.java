package days54_Review;

public class TestInheritance {

    public static void main(String[] args) {

        Person persObj = new Person();
        persObj.name = "Ali Pasa";
        persObj.personId = 12345;
        persObj.showInfo();

        Student studentObj = new Student();
        studentObj.name = "Ahmet Can";
        studentObj.schoolName = "Sokullu Mehmet Pasa";
        studentObj.bolumAd = "Matematik";
        studentObj.personId = 34567;
        studentObj.showInfoStudent();

        EngineeringStudent engStdtObj = new EngineeringStudent();
        engStdtObj.personId = 234;
        engStdtObj.name = "Can Can";
        engStdtObj.schoolName = "Bi şey Müh. Fakültesi";
        engStdtObj.bolumAd = "Bilgisayar";

        engStdtObj.showInfoEngineering();

        Teacher teacherObj = new Teacher();
        teacherObj.personId = 96;
        teacherObj.name = "Teacher Elizabeth";
        teacherObj.lessonGiven = "Monarchy";

        teacherObj.showTeacher();

    }
}
