package days60.BankClass;

public class AXIS extends Bank {

    public AXIS() {

        this.bankName = "AXIS";

    }

    @Override
    public float getRateOfInterest() {
        setRateOfInterest(9f);
        return super.getRateOfInterest();
    }
}
