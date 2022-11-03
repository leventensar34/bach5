package Days12_If_Ifelse;

public class IfStatements {

    public static void main(String[] args) {

        int score = 70;


        if (score >= 60) {

            System.out.println("Congrats");
            System.out.println("You passed the exam");

        }
        System.out.println("-------------");


        ////////////////
        int sales, bonus;
        double commisionRate, salary;

        sales = 5000;
        salary = 10000;

        if (sales > 3000) {
            bonus = 500;
            commisionRate = 1.5;
            salary = salary * commisionRate + bonus;

        }
        System.out.println("salary = " + salary);


    }
}
