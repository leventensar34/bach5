package days57_Interface;

public class Circle extends Shape {


    private double radius;
    public static final double PI=3.14;


    public Circle(double radius){
        super("Circle");
        setRadius(radius);

    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }




    @Override
    public double area() {
        return PI*radius*radius ;
    }

    @Override
    public double perimeter() {
        return 2*PI*radius;
    }
}
