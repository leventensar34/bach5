package days51_Inheritance2.AnimalExample;

public class Bird extends Animal{

    Bird(){

    }

    @Override
    public void sesCikar() {
        System.out.println("Birds says cik...cik");
        super.sesCikar();
    }
}
