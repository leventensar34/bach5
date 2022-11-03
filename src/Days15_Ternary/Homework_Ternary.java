package Days15_Ternary;

public class Homework_Ternary {
    public static void main(String[] args) {

        /// task 1: Write a progrsm to display whether the number is an odd number or even number
        // by using ternary operator

        int number = 331341;
        String result1 = (number % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println("result1 = " + result1);

        System.out.println("-----------------");

        /// task 2: write a program that checks if a student passed the exam or not by using ternary operator

        int puan = 40;
        String score = (puan >= 50) ? "You mark is " + puan + " and you passed" : "You mark " + puan + " and you failed.You needed " + (50 - puan) + " more points to pass the exam";
        System.out.println("score = " + score);

        System.out.println("------------------");

        /// task 3: Write a program that accepts name ,age and checks if a candidate is selected
        // for job by using ternary operator

        String name = "Ahmet Yilmaz";
        int age = 30;
        String result2 = (name == "Ahmet Yilmaz" && age == 27) ? "Hi " + name + " you are selected as QA Engineer " : "Hi " + name + " you are not selected as QA Engineer";
        System.out.println("result2 = " + result2);

        System.out.println("-------------------");

        /// task 4: Write a program that checks if a triangle is valid or not by using ternary operator

        double a=6;
        double b=8;
        double c=10;
        String result3=((a+b)>c&& (a+c)>b && (b+c)>a)?"This is a valid triangle ":"This is not a valid triangle";
        System.out.println("result3 = " + result3);

    }

}
