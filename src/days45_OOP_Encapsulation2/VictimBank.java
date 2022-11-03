package days45_OOP_Encapsulation2;

public class VictimBank {

/*
      int acc_number;
      int acc_balance;
      */
// 1. cozum / degiskenleri disardan saklamak
// degiskenleri private yaparak cozeriz
    private   int acc_number;
    private   int acc_balance;


      public int printAccountNumber(){
            return this.acc_number;
      }

      public int printAccountBalance(){
            return  this.acc_balance;
      }

      // 2. cozum / setter metoda kosul koymak
      public void depositMoney(int money){
           if (money>0){
                 this.acc_balance+=money;
           }

      }
}

