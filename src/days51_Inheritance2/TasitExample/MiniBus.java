package days51_Inheritance2.TasitExample;

public class MiniBus extends Vehicle{

    public boolean fourWheelDrive;

    @Override
    public void drive() {
        System.out.println("brandName = " + brandName);
        System.out.println("Otomatik arac ile aynı sadece D1 var.");
    }
}
