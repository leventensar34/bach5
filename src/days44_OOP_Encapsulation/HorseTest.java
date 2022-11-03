package days44_OOP_Encapsulation;

public class HorseTest {

    public static void main(String[] args) {

        Horse horse1 = new Horse();
        // accesing the instance from everywhere// public
        horse1.name = "Karayel";

        // not able to access instance  outside of the class //private
        // horse1.numberOfLegs=5;
        horse1.print();

    }
}
