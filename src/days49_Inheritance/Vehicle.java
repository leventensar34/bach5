package days49_Inheritance;

public class Vehicle extends GrandParent {

    public String name;
    double weight;
    double lenght;
    int seats;
    int lights;

    public Vehicle(){
        System.out.println("Vehicle constructor");
    }

    public void start() {
        System.out.println("Arac calisiyor");
    }

    public void stop() {
        System.out.println("Arac duruyor");

    }

    public void move() {
        System.out.println("Arac  hareket ediyor");

    }

}
