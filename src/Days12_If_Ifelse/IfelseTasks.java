package Days12_If_Ifelse;

public class IfelseTasks {

    public static void main(String[] args) {

        int num = 30;
        if (num % 2 == 0) {
            System.out.println(num + " cift sayidir");
        } else {
            System.out.println(num + " tek sayidir");
        }

        //////////


        double balance = 120;
        int score = 8;

        if (score >= 8) {

            balance += 50;
        }
        if (score > 6) {

            balance += 20;
        } else {

            balance -= 10;
        }

        System.out.println("balance = " + balance);

        ////////////


    }
}
