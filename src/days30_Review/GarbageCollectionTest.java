package days30_Review;

public class GarbageCollectionTest {

    int yas;
    String name;

    public  void finalize(){
        System.out.println("Nesne GC tarafından hafızadan temizlendi!");
    }

    public static void main(String[] args) {
        GarbageCollectionTest test1 = new GarbageCollectionTest();
        GarbageCollectionTest test2 = new GarbageCollectionTest();
        GarbageCollectionTest test3 = new GarbageCollectionTest();

        test1.yas = 35;
        test1.name = "Ahmet Falanca";

        test2.yas = 55;
        test2.name = "Hasan Falana";

        test3.yas = 65;
        test3.name = "Joerge Smith";

        System.out.println(test1.name);
        System.out.println(test2.name);
        System.out.println(test3.name);

        test1 = null;
        test2 = null;
        test3 = null;

        System.gc();

    }
}
