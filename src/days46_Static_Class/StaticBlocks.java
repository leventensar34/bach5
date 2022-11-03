package days46_Static_Class;


public class StaticBlocks {

    // Not: Class icinde static bloklar varsa once onlar okunur, daha sonra main metodun icine girer
    static int number;
    static String name;


    static {
        number = 15;
        name = "Hayirsever";
        System.out.println("Static block has executed");

        System.out.println("number in static block = " + number);
        System.out.println("name in static block = " + name);
        showInfo();
    }

    public static void showInfo(){
        System.out.println("Static method executed");
    }

    public static void main(String[] args) {

        System.out.println("Main method executed");
        number = 45;
        name = "Ahmet Falanca";

        System.out.println("number in static block = " + number);
        System.out.println("name in static block = " + name);
    }

}
