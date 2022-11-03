package days46_Review;

public class Box {

    // Data,state,properties,fields....

    int en;
    int boy;
    int yukseklik;

    public Box() {  // Default cons
        this.en = 1;
        this.boy = 1;
        this.yukseklik = 1;


    }

    public Box(Box kutu) {  // Obje kabul eden cons-->Passing Object as an argument to constructor..
        this.en = kutu.en;
        this.boy = kutu.boy;
        this.yukseklik = kutu.yukseklik;

    }

    public void addBox(Box kutu) {

        this.yukseklik += kutu.yukseklik;
    }

    public Box(int en, int boy) {
        this.en = en;
        this.boy = boy;

    }

    public Box(int en, int boy, int yukseklik) {
        this.en = en;
        this.boy = boy;
        this.yukseklik = yukseklik;
    }

    @Override
    public String toString() {
        return "Box{" +
                "en=" + en +
                ", boy=" + boy +
                ", yukseklik=" + yukseklik +
                '}';
    }

    public void displayInfo() {
        System.out.println("En: " + this.en +
                " Boy: " + this.boy +
                " Yukseklik: " + this.yukseklik);

    }
}
