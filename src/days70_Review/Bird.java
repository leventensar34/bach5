package days70_Review;

public class Bird extends Animal implements IAnimal,IUcabilir{


    public void eat(){
        System.out.println("Bird is eating");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void run() {
       // IUcabilir.super.run();
        System.out.println("Bird is running");
    }
}
