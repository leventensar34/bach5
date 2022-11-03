package days60.BankClass;

public class SBI extends Bank{

    public SBI() {
        this.bankName="SBI";

    }

    @Override
    public float getRateOfInterest() {
        setRateOfInterest(8f);
        return super.getRateOfInterest();
    }
}
