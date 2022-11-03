package days51_Inheritance2.AnimalExample;

public class AnimalTest {

    public static void main(String[] args) {

        Dog dog1=new Dog();
        Dog dog2=new Dog();
        Dog dog3=new Dog();

        Cat cat1=new Cat();
        Bird bird1=new Bird();



        dog1.name="Bob";
        dog1.color="White";
        dog1.numberOfLeg=4;

        System.out.println(dog1);

        dog2.color="Black";
        dog2.numberOfLeg=4;
        System.out.println(dog2);

        System.out.println(dog3);
        dog1.sesCikar();
        cat1.sesCikar();
        bird1.sesCikar();


    }
}
