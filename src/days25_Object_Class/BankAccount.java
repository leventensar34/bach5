package days25_Object_Class;

public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;


    public void deposit(double amount) {

        System.out.println("Depositting $"+amount+" to "+accountNumber);
        balance +=amount;
    }

    public void withdraw(double amount){

        if (amount>balance){
            System.out.println("------Insufficent Blance-----");
        }else{
            System.out.println("Withdrawing $"+amount+" from "+accountNumber);

            balance-=amount;
        }

    }
    public void charge( String item,double price){
        if (price>balance){
            System.out.println("------Insufficent Blance-----");
        }else {
            System.out.println("Withdrawing $"+price+" from "+accountNumber);
            balance-=price;
        }
    }

    public void displayBalance(){
        System.out.println("----------------");
        System.out.println("Account Holder Name : "+accountHolder);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance : "+balance);
        System.out.println("-----------------");

    }


}
