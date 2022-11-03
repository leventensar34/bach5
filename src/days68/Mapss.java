package days68;

import java.util.*;

public class Mapss {

    public static void main(String[] args) {

        HashMap<String, Integer> phoneNumbers = new HashMap<>(); // bu sekildede olabilir.

        Map<String, Integer> telefonNumaralari = new HashMap<>();
        listeYapalim(phoneNumbers);
      //  yeniListe(phoneNumbers); //Hata verir.cunku referans type ile yazilan parametre  arasinda bir bag yok.

        ArrayList<Integer> lis=new ArrayList<>();
        List<Integer> lis2=new ArrayList<>();

    }

    public static void listeYapalim(Map<String,Integer> list){
        System.out.println("list.size() = " + list.size());
    }

    public static void yeniListe(TreeMap<String,Integer> list){
        System.out.println("list.size() = " + list.size());
    }
}
