package days52_Access_Modifiers2;

import days52_Access_Modifiers.A1;

public class A5 {
    public static void main(String[] args) {

        A1 obj=new A1(); // Need to import class first if we want to create object from a class in another
       //  obj.i; //Can not access private instance and method
      // obj.test(); //Can not access private instance and method

       // A3.obj=new A3(); // Cn not create an object due to constructor being private
    }
}
