package Days13_NestedIf;

public class NestedIf3 {

    public static void main(String[] args) {

        int yas = 73;
        if (yas < 18){
            if (yas < 13) {
                System.out.println("Cocuk");
            } else {
                System.out.println("Genc");
            }
        }
        else {
            if (yas < 60){
                System.out.println(" Yetiskin");
            } else {
                System.out.println( " Yasli");
            }

        }

    }
}
