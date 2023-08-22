package aditi;
import java.util.HashMap;

public class Itinerary_from_tickets {
    public static String getStart(HashMap<String, String> tick){
        HashMap<String, String> reverse_Map = new HashMap<>();
        for (String key : tick.keySet()){
            //key -> key ; value -> tick.get(key)
            reverse_Map.put(tick.get(key), key);
        }
        for (String key : tick.keySet()){
            if (!reverse_Map.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String > tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        while (tickets.containsKey(start)){
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}