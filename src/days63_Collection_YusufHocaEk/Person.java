package days63_Collection_YusufHocaEk;

public class Person {

    String name;
    String city;
    int number;

    public void createPerson(String[] pers) {
        this.name = pers[0];
        this.city = pers[1];
        this.number = Integer.parseInt(pers[2]);
    }
}
