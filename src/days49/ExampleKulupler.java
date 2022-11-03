package days49;

import java.util.ArrayList;
import java.util.Arrays;

public class ExampleKulupler {

    public static void main(String[] args) {

        // 2. kelimeleri ayirarak bunlari bunlari sehirler olarak bir ArrayLiist olusturun.

        ArrayList<String> futbolKuulupleri = new ArrayList<>();

        futbolKuulupleri.add("Bayer Munich");
        futbolKuulupleri.add("Herta Berlin");
        futbolKuulupleri.add(2, "Sporting Lizbon");
        futbolKuulupleri.add("Eintracht Frankfurt");
        futbolKuulupleri.add("Borussia Dortmund");
        futbolKuulupleri.add("Werder Bremen");

        System.out.println("futbolKuulupleri = " + futbolKuulupleri);

        for (int i = 0; i < futbolKuulupleri.size(); i++) {
            int s = futbolKuulupleri.get(i).indexOf(" ");
            if (futbolKuulupleri.get(i).contains(" ")) {
                futbolKuulupleri.set(i, futbolKuulupleri.get(i).substring(s + 1));
            }

        }
        System.out.println(futbolKuulupleri);

        System.out.println("--------------------");
        /// 2.cozum
//        String cities = "";
//        for (String s : futbolKuulupleri) {
//            String[] str = s.split(" ");
//            cities += str[1] + " ";
//
//        }
//        String[] arrCities =cities.split(" ");
//        ArrayList<String> citiesList=new ArrayList<>(Arrays.asList(arrCities));
//        System.out.println(citiesList);

        // 3. kisa cozum

        for (int i = 0; i < futbolKuulupleri.size() ; i++) {
            String s= futbolKuulupleri.get(i);
            System.out.println(s.substring(s.indexOf(" ")+1));
        }




    }
}
