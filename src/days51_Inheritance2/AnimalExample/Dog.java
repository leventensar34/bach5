package days51_Inheritance2.AnimalExample;

public class Dog extends Animal {

    int numberOfLeg;

    public Dog() {
        super("Boby");  // super (); cons u sadece bir defa cagrilabilir, ve ilk satirda yazilmali.
        super.color = "Brown";


    }

    @Override
    public void sesCikar() {
        System.out.println("Dog says hav..hav");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "numberOfLeg=" + numberOfLeg +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
