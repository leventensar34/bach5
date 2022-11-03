package Days12_If_Ifelse;

public class IfelseStatement {

    public static void main(String[] args) {

        int score = 65;
        if (score >= 60) {
            System.out.println("Congrat");
            System.out.println("You passed the exam");
        } else {
            System.out.println("You failed the exam");
        }

        ////////////////

        int sales, bonus;
        double commisionRate, salary;

        sales = 2000;
        salary = 10000;

        if (sales > 3000) {
            bonus = 500;
            commisionRate = 1.5;
            salary = salary * commisionRate + bonus;

        } else {
            commisionRate = 1.2;
            salary = salary * commisionRate;

        }
        System.out.println("salary = " + salary);

        ////////////













    }
}
