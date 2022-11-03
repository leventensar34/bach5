package days60.Override;

public class Dogg extends Animall {

    public Dogg() {
        System.out.println("Dogg Child Class const");
    }

    public void eat() {
        super.eat();
        System.out.println(" Ayrica Kopekler ozellikle et yer");

    }

}
