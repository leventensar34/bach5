package Practice_AyseHoca.Week_2;

public class calisma9 {

    public static void main(String[] args) {


        System.out.println(alem("Insan özgur olmali","hözgur"));

    }

    public static int alem(String a,String b){
        if (a.contains(b)){
           return a.indexOf(b);
        }
        return -1;
    }
}
