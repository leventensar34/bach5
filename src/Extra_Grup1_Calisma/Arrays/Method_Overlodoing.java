package Extra_Grup1_Calisma.Arrays;

public class Method_Overlodoing {

    public static void main(String[] args) {

        /*
        1-Overloding icin mettodlarini isimleri ayni olmasi lazim
        2- Argumentlerin data tipleri farkli olmali
        3-Argumentlerin sayisi farkli olmali
         */
        System.out.println(toplam(10, 15));
        System.out.println(toplam(10, 15.5));
        System.out.println(toplam(15.5, 10));
        System.out.println(toplam(10, 10, 15.5f));


    }
    public static int toplam(int x,int y){
      return x+y;
    }
    public static float toplam(int x,int y,float z){
        return x+y+z;
    }
    public static double toplam(int x,double y){
        return x+y;
    }
    public static double toplam(double x,int y){
        return x+y;
    }
    public static String toplam(String x,int y){
        return x+y;
    }

}
