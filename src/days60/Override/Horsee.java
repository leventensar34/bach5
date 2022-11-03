package days60.Override;

public class Horsee extends Animall {


    public Horsee() {
        super();
        System.out.println("Horsee Child Class const");
    }

    @Override
    public void eat() {
      //  super.eat();
        System.out.println("Atlar otu pek sever");
    }
}
