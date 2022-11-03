package days27_Object2_GarbageCollection;

public class MemoryAllocation {

    public static void main(String[] args) {

    }

    public static void method1() {
        int x = 10;
        method2(5);
    }

    public static void method2(int b) {

        boolean c;

    }

    public static void method3() {
        Bank referance = new Bank();
    }


}

class Bank {
    int a;
    int b;
}
