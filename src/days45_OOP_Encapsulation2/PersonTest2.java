package days45_OOP_Encapsulation2;

public class PersonTest2 {

    public static void main(String[] args) {


        Person2 person = new Person2("isim", 40, 'F');
        // person.name="isim";

        person.setName("isim");
        System.out.println(person.getName());


        System.out.println("Name: " + person.getName() + " Age: " + person.getAge() + " Gender: " + person.gender);

    }
}
