package days51_Inheritance2;

public class Rectangle extends Shabe{

    private double witdt;
    private double length;

    public Rectangle(double witdt, double length) {
        this.witdt = witdt;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle draw method has called");
    }

    @Override
    public double getArea() {
        return witdt*length;
    }
}
