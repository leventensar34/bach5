package days60;

public class ChildC extends ParentC {

    // Not:  extends keyword u ile yapilir.
    String parentName;
    String childName;

    public ChildC() {
        super("test"); // parent class daki default cons i getir !!
    }

    public static void main(String[] args) {


    }

    public void test() {

        System.out.println("parentName = " + parentName); //Taha

        super.parentName = "Child da degistirildi";

        System.out.println("parentName = " + parentName); //Child da degistirildi

        this.childName = "child name";

        // super.childName="";  // Hata , cunku Parent class da childName diye bir obje yok

        /////////////////////////////////////

        // super.method();

        super.anaMethod(); // Bu ana sayfadaki ne yonlendirir
        this.anaMethod(); // kendi sayfasindakini okutur

    }

    public void anaMethod() {

        System.out.println("Child class da duzenlendi");

    }

    public void yazdir() {

    }


}
