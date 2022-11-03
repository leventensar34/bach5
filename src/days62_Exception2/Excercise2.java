package days62_Exception2;

public class Excercise2 {

    public static void main(String[] args) {


        try {
            int[] a = new int[2];
            a[5] = 8;
            int x = 9 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata olustu--> Array in olmayan indexine kayit ekleme  hatasi..!");
            // e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Hata olustu--> 0 a bolunme hatasi..!");
            // e.printStackTrace();
        }
    }
}