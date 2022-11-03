package days70_Review;

public class Cat extends Animal implements IAnimal,IYuzebilir{


    public void eat(){
        System.out.println("Cat is eating");
    }

    @Override
    public void swim() {
        System.out.println("Cat is swimming");
    }
}
