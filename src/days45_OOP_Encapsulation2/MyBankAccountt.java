package days45_OOP_Encapsulation2;

public class MyBankAccountt {

  private   int acc_number;
  private   int acc_balance;

    public MyBankAccountt(int acc_number, int acc_balance) {
        this.acc_number = acc_number;
        this.acc_balance = acc_balance;
    }

    public int printAccountNumber(){
        return this.acc_number;
    }

    public int printAccountBalance(){
        return  this.acc_balance;
    }

    public void depositMoney(int money){
        this.acc_balance+=money;
    }
}
