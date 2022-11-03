package days62_Review;

public class Engineer extends Employee {

    String workPlace;

    // Constructor overloading
    public Engineer(String name) {
        super(name);
    }

    public Engineer(String name, String workPlace) {
        super(name);
        this.workPlace = workPlace;
    }

    public void doDesing() {
        System.out.println(this.name + " isimli muhendis tasarim yapiyor");
    }

    @Override
    public void work() {
        System.out.println(this.name + " isimli muhendis calisiyor");
    }

    @Override
    public void showInfo() {
        System.out.println("----------Engineer--------");
        System.out.println("Name                :" + this.name);
        System.out.println("Name of work place  :" + this.workPlace);
        System.out.println("--------------------------");

    }
}
