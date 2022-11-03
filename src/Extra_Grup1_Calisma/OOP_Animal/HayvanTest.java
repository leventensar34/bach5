package Extra_Grup1_Calisma.OOP_Animal;

public class HayvanTest {

    public static void main(String[] args) {

        Kedi kedi1 = new Kedi("Yumos", 5, 10, 4, 18);
        System.out.println(kedi1.getIsim());
        System.out.println(kedi1.getBoy());
        System.out.println(kedi1.getKilo());
        System.out.println(kedi1.getBacakSayisi());
        kedi1.setIsim("katir");
        System.out.println(kedi1);
        kedi1.kos(20);
        kedi1.hareketeGec(30);

        System.out.println("-------------------------");
        Kedi kedi2 = new Kedi("Mavis", 6, 15, 4, 22);

        System.out.println(kedi2.toString());
        System.out.println("kedi2.getDisSayisi() = " + kedi2.getDisSayisi());

    }

}
