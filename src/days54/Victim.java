package days54;

public class Victim {

//    public int acc_number;
//    public int acc_balance;

    // 1. cozum / degiskenleri disardan saklamak
    // degiskenleri private yaparak cozeriz
    private int acc_number;
    private int acc_balance;


    public int printAccountBalance() {
        return acc_balance;
    }

    public int printAccountNumber() {
        return acc_number;
    }
   /*

   public void depositMoney(int money) {
        this.acc_balance = acc_balance + money;
        }
        */

    // 2. cozum / setter metoda kosul koymak
    public void depositMoney(int money) {
        if (money > 0) {
            this.acc_balance = acc_balance + money;
        }

    }




}
