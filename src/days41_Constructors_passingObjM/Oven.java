package days41_Constructors_passingObjM;

import java.util.ArrayList;

public class Oven {

    int temperature;
    int timer;

    ArrayList<SadeKek> tepsi=new ArrayList<>();

    public void cook(int temperature, int timer) {
        this.temperature = temperature;
        this.timer = timer;
        System.out.println("Kek pisiriliyor...");
    }

    public Oven() {

    }

    public  void tepsideNevar(){

        for (SadeKek kek : tepsi) {
            System.out.println(kek.name);
        }
    }
}
