package days54_Review;

public class MethodOverRidingTest {

    public static void main(String[] args) {

        Vehicle arac = new Vehicle();
        arac.benKimim();

        Car araba = new Car();
        araba.benKimim();
        double circleArea = araba.PI * 3 * 3;
        Vehicle honda = new Car();
        honda.benKimim();

        double pi =  Math.PI;


    }
}
