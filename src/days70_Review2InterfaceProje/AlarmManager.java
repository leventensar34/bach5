package days70_Review2InterfaceProje;

public class AlarmManager {

    public void inform(IAlarm alarm,Object obj){
        alarm.inform(obj);
    }
}
