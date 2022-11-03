package days50_Review;

public class StaticMethod {

    static String name = "Car";

    String model="Corolla";

    public static void show1() {
        show4();
        // show2(); // cagirma ancak  statik olunca olur
        System.out.println(name);
       // System.out.println(model);  //variable static olmadigi icin cagrilamaz
    }

    public void show2() {

        show1(); // Instance method dan statik metoda ulasilabilir
        System.out.println(name);
        System.out.println(model);

    }

    public void show3() {

        show2();
        System.out.println(model);

    }

    public static void show4() {


    }
}
