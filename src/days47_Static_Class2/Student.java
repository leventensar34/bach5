package days47_Static_Class2;

public class Student {

    // Class variables .. shared with object of class
    static String schoolName;
    static String schoolAddress;
    static String schoolDepartment;
    static String schoolTelNumber;
    static String schoolWebPage;
    static String schoolEmail;
    static int numberOfStudents;

    // instance (object) variables
    String studentName;
    String studentLastName;
    String studentAddress;
    int studentNumber;

    static {
        schoolName = "ABC School";
        schoolAddress = "Nowhere Street 15.Sommewhere in the world";
        schoolDepartment = "JAVA-SDET";
        schoolTelNumber = "123-987789 34";
        schoolWebPage = "ww.falancaschool.edu";
        schoolEmail = "info@falancaschool.edu";
        System.out.println("Static block called");
    }

    static {
        System.out.println("Second Static block called");
    }

    int a = 0; // not: statik olunca ardisik artarak yazdirir,fakat statik yazmazsak tek tek obje olarak yazdirir

    {
        a++;
        System.out.println(a + "- Static block called");
    }

    public Student() {
        numberOfStudent();
    }

    public void numberOfStudent() {
        numberOfStudents++;
        this.studentNumber = numberOfStudents;
    }


    @Override
    public String toString() {
        return "Student{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                ", schoolDepartment='" + schoolDepartment + '\'' +
                ", schoolTelNumber='" + schoolTelNumber + '\'' +
                ", schoolWebPage='" + schoolWebPage + '\'' +
                ", schoolEmail='" + schoolEmail + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                "\n------------------------------------------------------" +
                "\n studentName='" + this.studentName + '\'' +
                ", studentLastName='" + this.studentLastName + '\'' +
                ", studentAddress='" + this.studentAddress + '\'' +
                ", studentNumber=" + this.studentNumber +
                '}';
    }
}
