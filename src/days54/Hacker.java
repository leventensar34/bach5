package days54;

public class Hacker {

    public static void main(String[] args) {

        Victim user=new Victim();
        user.depositMoney(1000);

      // 1. senaryo / Hacker 100 tl calmak istiyor
       // user.acc_balance=-100;

        // 2. senaryo / Hacker setter metodu ile 100 tl calabilir

        user.depositMoney(-100);
        System.out.println("user.printAccountBalance() = " + user.printAccountBalance());


    }
}
