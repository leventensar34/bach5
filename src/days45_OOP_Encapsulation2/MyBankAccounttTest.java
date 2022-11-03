package days45_OOP_Encapsulation2;

public class MyBankAccounttTest {

    public static void main(String[] args) {

        MyBankAccountt myBankAccount = new MyBankAccountt(12345678, 0);

        System.out.println("Account Number : " + myBankAccount.printAccountNumber() + " Account Balance : " + myBankAccount.printAccountBalance());


       // myBankAccount.acc_balance=5000;
        myBankAccount.depositMoney(5000);
        System.out.println("Account Number : " + myBankAccount.printAccountNumber() + " Account Balance : " + myBankAccount.printAccountBalance());

        myBankAccount.depositMoney(10000);
        System.out.println("Account Number : " + myBankAccount.printAccountNumber() + " Account Balance : " + myBankAccount.printAccountBalance());


    }
}
