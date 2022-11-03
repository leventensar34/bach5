package Practice_AyseHoca.Week_1;

public class calisma4 {

    public static void main(String[] args) {

        int x1=getLoad();
        int d=getLoad(x1,"UeroTech");
        System.out.println(x1+d);
    }

    public static int getLoad(){
        return 3;
    }

    public static  int getLoad(int x1,String x2){
        return x1+x2.length()-2;
    }

    public static int getLoad(String str){
        return 4;
    }
}
