package days60.BankClass;

public class ICICI extends Bank {

    public ICICI() {
        this.bankName="ICICI";

    }

    @Override
    public float getRateOfInterest() {
        setRateOfInterest(7f);
        return super.getRateOfInterest();
    }
}
