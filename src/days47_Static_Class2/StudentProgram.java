package days47_Static_Class2;

import java.util.ArrayList;

public class StudentProgram {

    public static void main(String[] args) {

        ArrayList<Student> students=new ArrayList<>();

        int say=0;
        for (int i = 0; i <10 ; i++) {
          Student varStd = new Student();
          students.add(varStd);
          say++;
       }
        System.out.println("say = " + say);

        students.get(0).studentName="Ali";
        students.get(1).studentName="Veli";


        for (Student stds : students) {
            System.out.println("stds = " + stds);
        }
    }

}
