package days54;

public class MyBankAccountTest {

    public static void main(String[] args) {

        MyBankAccount user=new MyBankAccount(1413422,0);
        System.out.println("User account number: "+user.printAccountNumber()+" user accountt balance: "+user.printAccountBalance());

        user.depositMoney(55000);
        System.out.println("User account number: "+user.printAccountNumber()+" user accountt balance: "+user.printAccountBalance());



    }
}
