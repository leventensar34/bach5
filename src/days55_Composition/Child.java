package days55_Composition;

public class Child extends Parent {

    String name="ChildClass";

    public void print(){
        System.out.println(name);
    }

    public void printParent(){
        System.out.println(super.name);
    }
}
