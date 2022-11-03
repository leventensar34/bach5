package Practice_It;

public class calisma2 {

    public static void main(String[] args) {

        String b="Arslan";
        b+=b.concat("5").substring(3,b.length()-1);
        System.out.println(b);



        String slm="euroTechStudy Bech5";
        int y=slm.indexOf("e",6);
        System.out.println(slm.substring(4,y));

        int toplam=0;
        String word="21 yuzyil";
        toplam+=word.substring(1,2).length();
        System.out.println(toplam);


    }
}
