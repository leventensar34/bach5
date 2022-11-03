package days45_OOP_Encapsulation2;

public class HomeworkTest {

    public static void main(String[] args) {

        Homework rectangle = new Homework(100, 50);

        System.out.println(calc(rectangle));
    }

    public static int calc(Homework rectangle) {
        int sonuc;
        sonuc= rectangle.getLenght() * rectangle.getBreadth();
        return sonuc;
    }
}
