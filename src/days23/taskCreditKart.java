package days23;

public class taskCreditKart {

    public static void main(String[] args) {
        double salary = 6000;
        double creditRating = 6;

        if (salary >= 2000 && creditRating >= 5) {
            eligible();

        } else {
            notEligible();
        }

    }

    public static void eligible() {

        System.out.println("Conrat, you are eligible for the CC");
    }

    public static void notEligible() {
        System.out.println("i am sorry, you are not elibible for the CC");

    }


}
