package Practice_AyseHoca.Week_3;

public class calisma12 {

    public static void main(String[] args) {

        System.out.println(alem("edited"));


    }

    public static boolean alem(String str){
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(0)==str.charAt(str.length()-2)&&str.charAt(1)==str.charAt(str.length()-1)){
                return true;

            }
        }
        return false;
    }
}
