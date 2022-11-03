package Practice_AyseHoca.Week_1;

public class calisma5 {

    public static void main(String[] args) {

        System.out.println(alem("Hello"));

    }

    public static String alem(String a) {

        String newStr = "";
        for (int i = 2; i < a.length(); i++) {
            if (a.length() > 2) {
                newStr += a.charAt(i);
            } else {
                System.out.println("not valid String");
            }

        }
        newStr = newStr + a.charAt(0) + a.charAt(1);
        return newStr;
    }
}
