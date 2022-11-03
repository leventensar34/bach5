package days60_Polymorphism2;

public class A {

    public void methodA() {
    }
}

class B extends A {
    public void methodB() {
    }
}

class C extends B {
    public void methodC() {
    }
}

class Test {

    public static void main(String[] args) {

        A obj = new B();
        obj.methodA();

        B obj2 = (B) obj; // B obj2=new B();
        obj2.methodB();

        A obj3 = new C();
        obj3.methodA();

        B obj4 = (B) obj3;
        obj4.methodA();
        obj4.methodB();

        C obj5 = (C) obj4;
        obj5.methodA();
        obj5.methodB();
        obj5.methodC();

        System.out.println("---------------------");
        // Can not be casted below class level
        A obj6=new B();
        C obj7=(C)obj6;
        obj7.methodA();
        obj7.methodB();
        obj7.methodC();
       /*
        A
        B
        C
        D
        A obj=new D();
        casting level: B,C,D

         A obj2=new C();
        casting level: B,C
        not casting to D

        */
    }
}