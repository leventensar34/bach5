package days32_StringClass2;

public class String_Replace {

    public static void main(String[] args) {

        String str="Berlin is capital of Germany";

        str=str.replace("Berlin","London").replace("Germany","England");
        System.out.println(str);

        String email="isim_soyisim@gmail.com";
        String company="eurotechstudy";
       String yeniEmail= email.replace("gmail",company);
        System.out.println("yeniEmail = " + yeniEmail);

        String cumle="Coding is fun, it is my hobby";
        cumle=cumle.replace(" ","");
        System.out.println("cumle = " + cumle);

        cumle=cumle.replace(",","!!!");
        System.out.println("cumle = " + cumle);

    }
}
