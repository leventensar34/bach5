package days70_Review2InterfaceProje;

public class AlarmTestProg {

    public static void main(String[] args) {

        System.out.println("Alarm Programi");

        AlarmManager alarmManager=new AlarmManager();
        Sensor sensor=new Sensor(1,"ABC plaza",true);
        Sensor sensor1=new Sensor(1,"HONDA plaza",true);

        alarmManager.inform(new Itfaiye(),sensor);

        System.out.println("------------------");
        alarmManager.inform(new AcilServis(),sensor);

        System.out.println("-------------------");
        alarmManager.inform(new Polis(),sensor);

        System.out.println("-------------------");
        alarmManager.inform(new MyDB(),sensor);

        System.out.println("-------------------");
        alarmManager.inform(new MyDB(),sensor1);
    }
}
