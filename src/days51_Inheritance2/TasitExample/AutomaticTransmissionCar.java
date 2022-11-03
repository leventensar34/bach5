package days51_Inheritance2.TasitExample;

public class AutomaticTransmissionCar extends Vehicle{

    boolean fourWheelDrive= true;
    @Override
    public void drive()  {
        System.out.println("brandName = " + brandName);
        System.out.println("AutomaticTransmissonCar is ready to drive.");
        System.out.println("Change the stick to D1 position.");
        System.out.println("Press the acceleration pedal(Gaz pedalı).");
        System.out.println("---------------------------------------------");
    }
}
