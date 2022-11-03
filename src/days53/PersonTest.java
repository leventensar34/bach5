package days53;

public class PersonTest {

    public static void main(String[] args) {


        Person p1 = new Person();
//        p1.name="Ahmet";
//        p1.age=35;
//        System.out.println(p1.name);
//        System.out.println(p1.age);

        p1.setName("Ahmet");
        p1.setAge(35);
        System.out.println("p1.getName() = " + p1.getName());
        System.out.println("p1.getAge() = " + p1.getAge());

        Person p2=new Person();
        p2.setName("276624");
        p2.setAge(-35);
        System.out.println("p2.getName() = " + p2.getName());
        System.out.println("p2.getAge() = " + p2.getAge());
//        p2.name="8976543";
//        p2.age=-35;
//        System.out.println("p2.name = " + p2.name);
//        System.out.println("p2.age = " + p2.age);


    }
}
