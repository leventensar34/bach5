package days37;

import javax.management.BadStringOperationException;

public class StringReplace {

    public static void main(String[] args) {
     // String icerisinde bir kelimeyi yada Stringi degistirmek icin kullaniriz

        String str="Berlin is capital of Germany";

        str=str.replace("Berlin","London").replace("Germany","England");
        System.out.println(str);

        String email="isim_soyisim@gmail.com";
        String company="chip";

        String yeniEmail=email.replace("gmail",company);
        System.out.println(yeniEmail);



        String cumle="Coding is fun, it is my hobby";
        String bosluksuz=cumle.replace(" ","");
        System.out.println(bosluksuz);
        System.out.println(cumle);

        cumle=cumle.replace(",","!!!");
        System.out.println(cumle);


        String result="1-16 of over 1,000  results for \"computer\"";
        String result2=result.replace("1-16 of over","").replace(" results for \"computer\"","");
        System.out.println(result2);

    }
}
