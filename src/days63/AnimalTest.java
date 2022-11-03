package days63;

public class AnimalTest {

    public static void main(String[] args) {

        CobanKopegi kangal=new CobanKopegi("Kangal");
        kangal.color="white";
        kangal.leg=4;
        kangal.age=5;

        Cat mestan=new Cat("Mestan");
        kangal.moving();
        mestan.moving();
        mestan.color="gri";
        mestan.age=1;
        mestan.leg=4;

        kangal.animalInfo();
        mestan.animalInfo();

        HayvanCiftligi aliBaba=new HayvanCiftligi(mestan,kangal);


    }

}
