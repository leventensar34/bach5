package days25_Object_Class;

public class DogObject {

    public static void main(String[] args) {
        /// class name  object name  = new   class name();

        Dog dog1 = new Dog();

        Dog dog2 = new Dog();

        Dog dog3 = new Dog();

        // "." dat yani nokta ile tum field lere ve metotlara ulasilir.
        dog1.ad = "Artis";
        System.out.println("dog1.ad = " + dog1.ad);

        dog1.cins = "Tarrier";
        System.out.println("dog1.cins = " + dog1.cins);

        dog1.renk = "Siyah";
        System.out.println("dog1.renk = " + dog1.renk);

        dog1.yas = 5;
        System.out.println("dog1.yas = " + dog1.yas);

        System.out.println("-------------------------");

        dog1.havlama();
        dog1.isirma();
        dog1.yemekYeme();
        dog1.uyuma();

        System.out.println("dog2.ad = " + dog2.ad);
        System.out.println("dog2.cins = " + dog2.cins);
        System.out.println("dog2.yas = " + dog2.yas);
        System.out.println("dog2.evcil = " + dog2.evcil);
        System.out.println("dog2.cinsiyet = " + dog2.cinsiyet);

        // String "null" doner
        // int  0 doner
        // boolean false doner
        // char  "NUL" yada  /u0000  doner


    }
}
