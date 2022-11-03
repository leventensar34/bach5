package days46_Review;

public class Account {

   private String name;
   private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int depAmount){
        balance+=depAmount;
    }

    public void withdraw(int withdrawAmount){
        balance-=withdrawAmount;
    }
    public void balanceInfo(){
        System.out.println("Currently you have "+balance+" TL in your account");
    }



}
