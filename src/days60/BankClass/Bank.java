package days60.BankClass;

public class Bank {

    private float rateOfInterest;
    String bankName;

    public float getRateOfInterest(){
        System.out.println("Hosgeldiniz!!\nBankamizin faiz orani: ");
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }
}
