package days24;

public class taskConvertToMile {

    public static void main(String[] args) {
        convertToMile(100);
        convertToMile(250);
    }

    public static void convertToMile(double km) {
        double mile = 0;
        mile = km / 1.609;
        System.out.println(km + " km is equal to " + mile + " mile");


    }


}
