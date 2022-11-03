package days32_StringClass2;

public class String_Substring {

    public static void main(String[] args) {

        String str = "Java String manupilation is fun";
        System.out.println("str.substring(5) = " + str.substring(5));

        System.out.println(str.substring(5,11));

        System.out.println(str.substring(5, str.length() - 3));

        String symbol="{{}}";
        String word="JAVA IS COOL";
        String newStr=symbol.substring(0,2).concat(word).concat(symbol.substring(2,symbol.length()));
        System.out.println("newStr = " + newStr);



    }
}
