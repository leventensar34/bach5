package days51_Inheritance2;

public class Circle extends Shabe {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle shape has drawn");
    }
}
