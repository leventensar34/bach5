package days68_Maps;

import days63.Animal;

import java.util.*;

public class CapitalCity {

    public static void main(String[] args) {

        Map<String, String> capital = new HashMap<>();
        capital.put("Turkey", "Ankara");
        capital.put("England", "London");
        capital.put("Germany", "Berlin");
        capital.put("France", "Ankara");
        capital.put("Italy", "Rome");

        Set<String> countryNames = capital.keySet();
        System.out.println("countryNames = " + countryNames);

        for (String country : countryNames) {
            System.out.print(country + " ");
        }

        System.out.println();
        Collection<String> capitalCities = capital.values();
        System.out.println("capitalCities = " + capitalCities);

        for (String city : capitalCities) {
            System.out.print(city + " ");
        }

        capital.putIfAbsent("Greece","Athens");

        System.out.println();
        System.out.println("capital = " + capital);

        System.out.println("-------------------------");

        capital.putIfAbsent("England","London");
        System.out.println("capital = " + capital);

        // Butun obje tipleri sadece value kisminda yazilabilir...
        Map<Integer,String>map1=new HashMap<>();
        Map<String,String[]> map2=new HashMap<>();
        Map<Integer, List<String>> map3=new HashMap<>();
        Map<String,Map<Integer,String>> map4=new HashMap<>();
        Map<String, Animal> map5=new HashMap<>();


    }
}
