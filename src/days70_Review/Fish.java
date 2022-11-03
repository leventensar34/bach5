package days70_Review;

public class Fish extends Animal implements IAnimal,IYuzebilir {

    public void eat(){
        System.out.println("Fish is eating");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
