package Days13_NestedIf;

public class NestedIf2 {

    public static void main(String[] args) {

        int age = 78;
        if (age > 0) {
            if (age > 0 && age < 13) {
                System.out.println(" Cocuk");
            }
            if (age >= 13 && age <= 17) {
                System.out.println("Genc");
            }
            if (age >= 18 && age <= 59) {
                System.out.println("Yetiskin");
            } else {
                System.out.println(" 60 veya 60 ustu bir yasa sahip");
            }


        }

    }
}
