package days70_Review2InterfaceProje;

import java.util.ArrayList;

public class MyDB implements IAlarm{

    ArrayList<Sensor> myDB=new ArrayList<>();
    @Override
    public void inform(Object obj) {
        // Veritabani baglantilarini kur. // Eklemeler yapilarak

        myDB.add((Sensor)obj);
       // System.out.println("myDB.size() = " + myDB.size());

        /*
        System.out.println("Alarm gonderen istasyon = " + ((Sensor) obj).getName());
        System.out.println("Alar durumu = " + ((Sensor) obj).isStatus());

         */

        System.out.println("Alarm bilgisi kurum veri tabanina eklendi");

        for (Sensor se : myDB) {
            System.out.println(se.getName());
            System.out.println(se.isStatus());
        }

    }
}
