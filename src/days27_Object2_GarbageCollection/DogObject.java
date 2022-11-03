package days27_Object2_GarbageCollection;

public class DogObject {

    public static void main(String[] args) {

        // Garbage colletion icin object unreferenced yapmanin 2 yolu var

        // 1. yol
        Dog dog1=new Dog();

        System.out.println("dog1 = " + dog1);



        dog1=null;
        System.out.println("dog1 = " + dog1);

        // 2.yol bir objecti diger bir object te
        Dog dog2=new Dog();
        System.out.println("dog2 = " + dog2);

        Dog dog3=new Dog();
        System.out.println("dog3 = " + dog3);
        dog2=dog3;

        System.out.println("dog2 = " + dog2);
        System.out.println("dog3 = " + dog3);

    }
}
