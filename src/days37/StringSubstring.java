package days37;

public class StringSubstring {

    public static void main(String[] args) {

        // Kesme islemi yapmak istegin zaman kullanili. Bu kesme islemi ile beraber kesilen yere ekleme String yapilabilir

        String str="Java String manipulation is run!";


        System.out.println(str.substring(5));
        System.out.println(str.substring(5,11));

        System.out.println(str.substring(5,str.length()-5));

        String symbol="{{}}";
        String word="JAVA IS COOL";
        String result=symbol.substring(0,2)+word+symbol.substring(2);
        System.out.println(result);

      String  result2=symbol.substring(0,2).concat(word).concat(symbol.substring(2));
        System.out.println(result2);

    }
}
