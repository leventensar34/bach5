package days54;

public class MyBankAccount {

    private int acc_number;
    private int acc_balance;

    public MyBankAccount(int acc_number, int acc_balance) {
        this.acc_number = acc_number;
        this.acc_balance = acc_balance;
    }

    public int printAccountBalance() {
        return acc_balance;
    }

    public int printAccountNumber() {
        return acc_number;
    }

    public void depositMoney(int money) {
        this.acc_balance = acc_balance + money;

    }


}
