package days52_Access_Modifiers2;

import days52_Access_Modifiers.C1;

public class C3 extends C1 {

    public static void main(String[] args) {

        C1 obj3 = new C1();
        //  obj3.test(); // Protected Parent class uzerinden degerlere izin vermez

        C3 obj4 = new C3(); // Protected Child (Sub) class uzerinden degerlere izin verir.
        obj4.test();
    }
}
