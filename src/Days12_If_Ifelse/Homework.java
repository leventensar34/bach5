package Days12_If_Ifelse;

public class Homework {

    public static void main(String[] args) {

        ////// task 1: Write a program that checks the angles and decides if it is triangle or not?

        int a = 3, b = 4, c = 5;
        if (a + b > c && b + c > a && a + c > b) {

            System.out.println(" it is triangle");
        } else {
            System.out.println(" It is not triangle");
        }
        System.out.println("-----------------");

        ///// task 2: Write an if statement that multiplies salary by 1.5 if hours is greater than 38

        int workTime = 40;
        double salary = 1000;
        if (workTime > 38) {
            salary = salary * 1.5;
        }
        System.out.println("salary = " + salary);

        System.out.println("------------------");

        //// task 3: Write an if statement that assigns 1 to x if y is greater than 0.

        int x = 12;
        int y = 33;
        if (y > 0) {
            x = 1;
        }
        System.out.println("y = " + y);
        System.out.println("x = " + x);

        System.out.println("------------------");

        //// task 4: Write an if statement that increases pay by 3% if score is greater than 90.

        int i = 95;
        double pay = 200;
        if (i > 90) {
            pay =pay* 1.03;
        }
        System.out.println("pay = " + pay);


        System.out.println("------------------");

    }
}
