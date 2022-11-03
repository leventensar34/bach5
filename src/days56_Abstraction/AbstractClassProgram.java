package days56_Abstraction;

public class AbstractClassProgram {

    public static void main(String[] args) {


        Dog boby = new Dog();

        boby.name = "Boby";
        boby.color = "Black";
        boby.numberOfLegs = 4;

        System.out.println(boby.printInfo());

        boby.createSound();
        boby.sleep();

        System.out.println("----------------------");

        Cat mahur = new Cat();
        mahur.name = "Mahur";
        mahur.color = "Gray";
        mahur.numberOfLegs = 4;

        System.out.println(mahur.printInfo());

        mahur.createSound();
        mahur.sleep();
        /*
        Animal animal1=new Animal(); // Abstract class indan obje olusturamayiz

        animal1.name="Herhangi bir hayvan";
        animal1.color="Beyaz";

        System.out.println(animal1.printInfo());
        animal1.createSound();
        animal1.sleep();

         */
    }
}
