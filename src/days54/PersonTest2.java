package days54;

import days53.Person;

public class PersonTest2 {

    public static void main(String[] args) {


        Person2 p3 = new Person2("Mehmet", 40, 'M');

        System.out.println("Name: " + p3.getName() + " Age: " + p3.getAge() + " Gender: " + p3.getGender());

        p3.setAge(45);
        System.out.println(p3.getAge());
    }
}
