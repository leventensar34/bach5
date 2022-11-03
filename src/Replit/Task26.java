package Replit;

public class Task26 {

    public static void main(String[] args) {

        System.out.println(mergeString("1234","abcd"));
    }
//1a2b3c4d
    public static String mergeString(String one, String two) {
        String newStr = "";
        for (int i = 0; i < one.length(); i++) {
            newStr += one.charAt(i)+two.concat(String.valueOf(two.charAt(i)));
        }
        return newStr;
    }
}
