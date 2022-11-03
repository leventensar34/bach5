package days62;

public class TestParentChild {

    public static void main(String[] args) {

        Child child = new Child();
        System.out.println("Valoue before increment : " + child.num);

        child.increment();
        System.out.println("Valoue after increment : " + child.num);

        System.out.println("-------------------------------------");
        Parent parent = new Parent();  //Eger parent class degerini yazdirmak istiyorsak parent classindan obje olusturmamiz lazim

        System.out.println("Valoue before increment : " + parent.num);

        parent.increment();
        System.out.println("Valoue after increment : " + parent.num);

    }

}
