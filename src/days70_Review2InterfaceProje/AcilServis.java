package days70_Review2InterfaceProje;

public class AcilServis implements IAlarm{
    @Override
    public void inform(Object obj) {
        System.out.println("Alarm gonderen istasyon = " + ((Sensor) obj).getName());
        System.out.println("Alar durumu = " + ((Sensor) obj).isStatus());
        System.out.println("112 acil servisine bilgi verildi");
    }
}
