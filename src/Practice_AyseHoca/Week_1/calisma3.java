package Practice_AyseHoca.Week_1;

public class calisma3 {
    public static void main(String[] args) {

        String str="Gunes";
        System.out.println(getMesaj(str));

    }
    public static  String getMesaj(String x){
        String str="Yaz geldi";
        str=str.concat("artik gulmeli x");
        str.replace("x",x);
        String review="ve cocuklar";
        str.concat(review);
        return str;

    }
}
