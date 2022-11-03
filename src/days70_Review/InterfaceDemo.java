package days70_Review;

public class InterfaceDemo {

    public static void main(String[] args) {

      Cat c1=new Cat();
      c1.name="Tekir";
      c1.eat();
      c1.swim();

      Bird b1=new Bird();
      b1.name="Karga";
        b1.eat();
        b1.fly();
        b1.run();

        IAnimal an1=new Cat();
        an1.eat();
        ((Cat)an1).swim();

        an1=new Bird();
        ((Bird)an1).fly();

        an1=new Fish();
        ((Fish)an1).swim();

    }
}
