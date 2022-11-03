package days21_Methods1;

public class MethodWithLoop {

    public static void main(String[] args) {
        System.out.println("Main metod icindeyim");
        for (int i = 1; i < 5; i++) {
            displayMessage();
            System.out.println("Tekrar main metod icindeyim");
            System.out.println("----------");
        }
        System.out.println("Son kez main metod icindeyim");
    }

    public static void displayMessage() {

        System.out.println("displayMessage icerisindeyim");
    }
}
