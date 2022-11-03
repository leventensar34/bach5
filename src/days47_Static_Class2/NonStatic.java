package days47_Static_Class2;

public class NonStatic {

    // Not: Oncelikle static olan blocklar, sonra main metod, daha sonra non-static metodlar ve constructorlar yazdirilir
    static int a = 5;
    static int b;

    static {
        b = 15;
        System.out.println("Executed static block");
    }

    {
        System.out.println("Executed non-static block");

    }

    NonStatic() {
        System.out.println("Execution of constructor");

    }

    public static void main(String[] args) {

        System.out.println("Executing of main method");
        NonStatic stNstc = new NonStatic();


    }
}
