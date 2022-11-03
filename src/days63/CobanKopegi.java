package days63;

public class CobanKopegi extends Dog {

    public CobanKopegi(String name) {
        super(name);

    }

    @Override
    public void voice() {
        System.out.println(getName() + "barking");
    }

    @Override
    public void moving() {
        System.out.println(getName()+" running");
    }
}
