package days46_Static_Class;

public class Ulkeler {

    static int ulkelerSayaci;
    String name;
    int dummyCounter;

    @Override
    public String toString() {
        return "Ulkeler{" +
                "name='" + name + '\'' +
                ", dummyCounter=" + dummyCounter +
                '}';
    }

    public static void main(String[] args) {

        Ulkeler ob1=new Ulkeler();
        ob1.name="India";
        ob1.dummyCounter=1;
        ++ulkelerSayaci;

        System.out.println("ob1 = " + ob1);
        System.out.println("Number of countries created: "+ulkelerSayaci);

        Ulkeler ob2=new Ulkeler();
        ob2.name="India";
        ob2.dummyCounter=1;
        ++ulkelerSayaci;

        System.out.println("ob2 = " + ob2);
        System.out.println("Number of countries created: "+ulkelerSayaci);




    }
}
