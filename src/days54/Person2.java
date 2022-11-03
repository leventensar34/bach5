package days54;

public class Person2 {

    private String name;
    private int age;
    public char gender;

    public Person2(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    //Getter
    public String getName() {
        return name;
    }


    //Setter
    public void setName(String newName) {
        this.name = newName;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;

    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
