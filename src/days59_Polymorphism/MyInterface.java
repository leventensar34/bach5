package days59_Polymorphism;

public interface MyInterface {


    void show();
}

class ClassA implements MyInterface {

    public void show() {
        System.out.println("ClassA shows");
    }
}

class ClassB implements MyInterface {


    public void show() {
        System.out.println("ClassB shows");
    }
}

class PolymorphismExample2{

    public static void main(String[] args) {

        // Non polymorphic object
        ClassA classA=new ClassA();
        classA.show();

        ClassB classB=new ClassB();
        classB.show();

        System.out.println("------------------");
        // Polymorphic object Interface

        MyInterface classA1=new ClassA();
        classA1.show();
        MyInterface classB1=new ClassB();
        classB1.show();

    }


}