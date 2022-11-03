package days51_Inheritance2;

public class ShabeTest {

    public static void main(String[] args) {

        Rectangle rec1=new Rectangle(5,15);
        rec1.draw();
        System.out.println("rec1.getArea() = " + rec1.getArea());

        System.out.println("------------------------------");

        Circle circle1=new Circle(5);
        circle1.draw();
        System.out.println("circle1.getArea() = " + circle1.getArea());

    }
}
