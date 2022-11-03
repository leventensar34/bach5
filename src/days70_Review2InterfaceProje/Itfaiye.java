package days70_Review2InterfaceProje;

public class Itfaiye implements IAlarm{
    @Override
    public void inform(Object obj) {
        System.out.println("Alarm gonderen istasyon = " + ((Sensor) obj).getName());
        System.out.println("Alar durumu = " + ((Sensor) obj).isStatus());
        System.out.println("Itfaiyeye bilgi verildi");
    }
}
