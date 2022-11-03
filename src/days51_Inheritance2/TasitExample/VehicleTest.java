package days51_Inheritance2.TasitExample;

public class VehicleTest {

    public static void main(String[] args) {

        AutomaticTransmissionCar autoCar = new AutomaticTransmissionCar();
        autoCar.brandName = "Mercedes";
        System.out.println("autoCar.fourWheelDrive = " + autoCar.fourWheelDrive);
        autoCar.drive();

        ManuelTransmissionCar manuelCar = new ManuelTransmissionCar();
        manuelCar.brandName="Sahin";
        manuelCar.drive();

        MiniBus mini1 = new MiniBus();
        mini1.brandName="Golf";
        System.out.println("mini1.fourWheelDrive = " + mini1.fourWheelDrive);
        mini1.drive();

    }
}
