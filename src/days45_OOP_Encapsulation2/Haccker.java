package days45_OOP_Encapsulation2;

public class Haccker {

    public static void main(String[] args) {

        VictimBank hacker = new VictimBank();

        // 1. senaryo
        //  hacker.acc_balance=100;

        System.out.println("Account Number : " + hacker.printAccountNumber() + " Account Balance : " + hacker.printAccountBalance());

        hacker.depositMoney(-1000);
        System.out.println("Account Number : " + hacker.printAccountNumber() + " Account Balance : " + hacker.printAccountBalance());


    }
}
