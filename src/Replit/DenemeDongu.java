package Replit;

import java.util.Scanner;

public class DenemeDongu {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Greater!");
        String subject1 = null, subject2 = null, subject3 = null, subject4 = null, subject5 = null, summary = null;
        ;
        double grade, grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, avarage = 0;
        int sayac = 1;
        double sum=0;
        while (sayac <= 5) {

            System.out.println("Please enter subject name number " + sayac + " and score for this subject");
            String subject = scan.nextLine();
            grade = scan.nextDouble();
            sayac++;
        }

        avarage = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;

        System.out.println("Summary: " + subject1 + "-" + grade1 + "," + subject2 + "-" + grade1 + "," + subject3 +
                "-" + grade1 + "," + subject4 + "-" + grade1 + "," + subject5 + "-" + grade1);

        System.out.println("Your average score is: " + avarage);

        System.out.println("Thank you for using Grader!");

        System.out.println("Goodbye!");

    }
}
