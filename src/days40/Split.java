package days40;

import java.util.Arrays;

public class Split {

    public static void main(String[] args) {

        String futbolKulupler="barcelona,milan ,dortmund,hamburg,bremen,zurich";

       String[] splitteKulup = futbolKulupler.split(",");

        System.out.println("splitteKulup[0] = " + splitteKulup[0]);

        System.out.println("Arrays.toString(splitteKulup) = " + Arrays.toString(splitteKulup));

       String kitaplar="sefiller,kasagi,kumarbaz,vadidedi zambak,sinekli bakkal";
       String[] splitKitaplar=kitaplar.split(", ");

        System.out.println("splitKitaplar[splitKitaplar.length-1] = " + splitKitaplar[splitKitaplar.length - 1]);
        System.out.println("splitKitaplar[0] = " + splitKitaplar[0]);


    }
}
