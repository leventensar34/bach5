package days23;

public class booleanArguement {

    public static void main(String[] args) {

        climbEverest(true);
        climbEverest(false);


    }

    public static void climbEverest(boolean isHeealty) {

        if (isHeealty) {
            System.out.println("Yes , you are eligible to climb the month");
        } else {
            System.out.println("No, you are not eligible to climb the month");
        }

    }


}
