package days21_Methods1;

public class Task_CreditCard {

    public static void main(String[] args) {

        //Write a program that checks if user is eligible for credit card according to users monthly income and
        // display  result in two different methods

        double creditPuan = 8;
        double salary = 3500;

        if (salary > 3000 && creditPuan > 5) {
            userEligible();
        } else {
            userNotEligible();
        }


    }

    public static void userEligible() {

        System.out.println("You are eligible for the Credit Card");
    }

    public static void userNotEligible() {

        System.out.println("You are not eligible for the Credit Card ");
    }


}
