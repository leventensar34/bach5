package days57_Interface;

public abstract class Shape {


    private final String name;

    public Shape(String name){
        this.name=name;
    }

    public abstract double area();
    public abstract double perimeter();


}
/**     we can NOT instantiate Abstract classes
 class A {

 Shape shape=new Shape(); //illegal

 }
 */



