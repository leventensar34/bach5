package days62_Exception2;

public class Excercise1 {

    public static void main(String[] args) {


        try {
            int x = 9 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Hata olustu--> 0 a bolunme hatasi..!");
            System.out.println(e.getMessage());
            // e.printStackTrace();
            try {
                int a[] = new int[2];
                a[5] = 8;
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("Hata olustu--> Array in olmayan indexine kayit ekleme  hatasi..!");
                System.out.println(a.getMessage());
            }
            System.out.println("Devam et");
        }
    }
}
