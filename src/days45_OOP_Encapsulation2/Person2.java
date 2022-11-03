package days45_OOP_Encapsulation2;

public class Person2 {

    private String name;
    private int age;
    public char gender;

    public Person2(String name, int age, char gender) {

        setName(name);
        setAge(age);
        setGender(gender);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
