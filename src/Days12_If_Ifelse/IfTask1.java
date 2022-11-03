package Days12_If_Ifelse;

public class IfTask1 {

    public static void main(String[] args) {

        int num = 35;
        if (num == 0) {
            System.out.println("girilen sayi sifirdir");
        }
        if (num != 0) {
            if (num % 5 == 0) {
                System.out.println("Hi Five");
            }
            if (num % 2 == 0) {
                System.out.println("Hi Even");
            }
        }
    }
}
