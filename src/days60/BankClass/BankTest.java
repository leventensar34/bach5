package days60.BankClass;

public class BankTest {

    public static void main(String[] args) {

        SBI sbi = new SBI();
        System.out.println("sbi.bankName = " + sbi.bankName);
        System.out.println("sbi.getRateOfInterest() = " + sbi.getRateOfInterest());

        System.out.println("-------------------------------");

        AXIS axi=new AXIS();
        System.out.println("axi.bankName = " + axi.bankName);
        System.out.println("axi.getRateOfInterest() = " + axi.getRateOfInterest());

        System.out.println("--------------------------------");

        ICICI ici=new ICICI();
        System.out.println("ici.bankName = " + ici.bankName);
        System.out.println("ici.getRateOfInterest() = " + ici.getRateOfInterest());

    }
}
