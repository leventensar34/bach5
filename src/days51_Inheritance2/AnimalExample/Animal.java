package days51_Inheritance2.AnimalExample;

public class Animal {

    public String name;
    public String color;

    public Animal() {
        System.out.println("Super Class Default cons has called");

    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Super Class paramet. cons has called");

    }

    public void sesCikar(){

        System.out.println("Every animal can say something ");
    }
}
