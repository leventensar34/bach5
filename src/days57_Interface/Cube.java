package days57_Interface;

public class Cube extends Shape implements Volume {


    private double side;

    public Cube(double side){
        super("Cube");

    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side=side;
    }

    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public double perimeter() {
        return 12*side;
    }

    public double volume(){
        return side*side*side;
    }

}
