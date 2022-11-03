package days23;

public class taskGreaterNumber {

    public static void main(String[] args) {
        findGreater();

    }

    public static void findGreater() {
        int num1 = 40;
        int num2 = 70;
        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater");


        } else {
            System.out.println("numbers is equal");
        }


    }


}
