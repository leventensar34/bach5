package days63;

public abstract class Animal {

    private String name;
    int leg;
    String color;
    int age;


    public Animal(String name) {
        this.name = name;
    }

    public abstract void voice();

    public abstract void moving();

    public void eating() {
        System.out.println(this.name + " eating.");
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", leg=" + leg +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }


    public void animalInfo() {
        System.out.println("Animal{" +
                "name='" + name + '\'' + " Age =" + age +
                ", leg=" + leg +
                ", color='" + color + '\'' +
                '}');
    }
}
