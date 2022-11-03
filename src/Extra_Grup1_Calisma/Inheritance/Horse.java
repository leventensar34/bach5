package Extra_Grup1_Calisma.Inheritance;

public class Horse extends Animal {

    public Horse() {
       super();
        System.out.println("Horse Child class cons.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Atlar ot yer");
    }

}
