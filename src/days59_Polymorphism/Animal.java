package days59_Polymorphism;

public class Animal {


    public void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{


    public void sound(){
        System.out.println("Dog says : Hav hav");
    }

}

class Cat extends Animal{


    public void sound(){
        System.out.println("Cat says : Miyav miyav");
    }

}

class Duck extends Animal{


    public void sound(){
        System.out.println("Duck says : Vak vak");
    }

}

class PolymorphismExample{

    public static void main(String[] args) {

        // Non polymorphic object olusturma
        Animal animal=new Animal();
        animal.sound();

        Dog dog=new Dog();
        dog.sound();

        Cat cat =new Cat();
        cat.sound();

        Duck duck=new Duck();
        duck.sound();

        System.out.println("---------------------");

        // Polymorphic object olusturma

        Animal dog1=new Dog();
        dog1.sound();
        Animal cat1=new Cat();
        cat1.sound();
        Animal duck1=new Duck();
        duck1.sound();

        System.out.println("---------------------");
        // Same object, same method but different behaviour

        Animal animal1=new Animal();
        animal1.sound();
        animal1=new Dog();
        animal1.sound();
        animal1=new Cat();
        animal1.sound();
        animal1=new Duck();
        animal1.sound();



    }


}
