package days55_Composition;

public class Test {

    public static void main(String[] args) {



        Child child= new Child();

        child.print();
        /*
         not: parent a iki sekilde ulasabiliriz
        1- parent tan obje olusturarak
        2-child class ta yeni bir metod olusturup super keyword le cagirabiliriz.
         */

        //   Parent parent=new Parent();
        //  child.print();

        child.printParent();

    }
}
