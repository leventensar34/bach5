package days63;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName()+" miyavliyor.");
    }

    @Override
    public void moving() {
        System.out.println(getName()+" yuruyor.");
    }
}
