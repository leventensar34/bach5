package days68_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {


    public static void main(String[] args) {

        ArrayList<String> players = new ArrayList<>();
        players.add("Weghorst");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);

        Map<String, Integer> footballPlayers = new LinkedHashMap<>();
        footballPlayers.put("Weghorst",10);
        footballPlayers.put("Dele Ali",11);
        footballPlayers.put("Joseph De Souza",5);


        System.out.println(footballPlayers);

        System.out.println("footballPlayers.get(\"Weghorst\") = " + footballPlayers.get("Weghorst"));
        System.out.println("footballPlayers.get(\"Dele Ali\") = " + footballPlayers.get("Dele Ali"));
        System.out.println("footballPlayers.get(5) = " + footballPlayers.get(5)); // deger yoksa null atar

    }
}
