package Days15_Ternary;

public class NestedTernary {

    public static void main(String[] args) {

        int x = 4;
        if (x > 2) {
            if (x < 5) {
                System.out.println(10);
            } else {
                System.out.println(7);
            }
        } else {
            System.out.println(5);
        }

        System.out.println("-----------------");

        System.out.println(x > 2 ? x < 5 ? 10 : 7 : 5);

///////////
        int n1=10;
        int n2=5;
        int larger=(n1>n2)?n1:n2;
        System.out.println("larger = " + larger);

//////
        int num1=50;
        int num2=40;
        int num3=30;
        int largest=(num1>num2)?(num2>num3? num1:num2):(num2>num3?num2:num3);
        System.out.println("largest = " + largest);

////////////////


        int not = 45;

        String puan = (not >= 90) ? "Puaniniz A" :
                (not >= 80 ) ? "Puaniniz B" :
                        (not >= 70 ) ? "Puaniniz C" :
                                (not >= 60 ) ? "Puaniniz D" :
                                        (not >= 50 ) ? "Puaniniz E" :
                                                "Kaldiniz";

        System.out.println("puan = " + puan);




    }
}
