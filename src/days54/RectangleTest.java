package days54;

public class RectangleTest {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 20);

        System.out.println(rectangle.getBreadth());
        System.out.println(rectangle.getLenght());

        System.out.println(calculation(rectangle));

    }

    public static int calculation(Rectangle rectangle) {

        int result = rectangle.getLenght() * rectangle.getBreadth();
        return result;

    }

}
