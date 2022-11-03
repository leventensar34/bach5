package days51_Inheritance2.TasitExample;

public class ManuelTransmissionCar extends Vehicle{

    @Override
    public void drive() {
        System.out.println("brandName = " + brandName);
        System.out.println("ManuelTransmissonCar is ready to drive.");
        System.out.println("Debriyeje basıp vites kolunu uygun bir pozisyona alın");
        System.out.println("Debriyejden ayagınızı kaldırın.");
        System.out.println("Press the acceleration pedal(Gaz pedalı).");
        System.out.println("-----------------------------------------------");
    }
}
