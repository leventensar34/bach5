package Extra_Grup1_Calisma.Inheritance;

public class Dog extends Animal {

    public Dog() {
        System.out.println("Dog Child class cons.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Ayrica Kopekler ozellikle et yer");

    }
}
