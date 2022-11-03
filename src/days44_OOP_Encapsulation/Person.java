package days44_OOP_Encapsulation;

public class Person {

   private String name;
   private int age;


    public void print(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        //condition
        this.name = newName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        //condition
        this.age = newAge;
    }
}
