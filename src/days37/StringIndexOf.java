package days37;

public class StringIndexOf {

    public static void main(String[] args) {
     // Index metodu aranilan bir harfin kacinci sirada oldugunu yani index degerini bulmamiza yardimci olur.

        String word = "Germany";

        System.out.println(word.indexOf("G"));
        System.out.println(word.indexOf("rm"));
        System.out.println(word.indexOf("many"));

        System.out.println(word.indexOf("zz"));

        String url="www.euroTech.com";
        int index=url.indexOf(".");
        System.out.println(". nin indexi: "+index);

        System.out.println(url.charAt(index+1));


        String baslik="Java - Geoogle Search";
        int cizgi=baslik.indexOf("-");
        System.out.println(cizgi);

        System.out.println(baslik.charAt(cizgi-1));

        System.out.println(baslik.charAt(cizgi+1));


        // Birden fazla ayni karakter varsa sonrakinin indexini tespit etmek

        String liste="java-javascript-c++-Phyton-PHP";
        int birinciCizgi=liste.indexOf("-");
        System.out.println(birinciCizgi);

        int ikinciCizgi=liste.indexOf("-",birinciCizgi+1);
        System.out.println(ikinciCizgi);

        int ucuncuCizgi=liste.indexOf("-",ikinciCizgi+1);
        System.out.println(ucuncuCizgi);


        int sonCizgi=liste.lastIndexOf("-");
        System.out.println(sonCizgi);

    }
}
