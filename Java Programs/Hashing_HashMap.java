package aditi;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing_HashMap {
    public static void main(String[] args) {
        //Country(String), Population(Integer)
        //Creation
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 125);
        map.put("US", 30);
        map.put("China", 150);

        //Print
        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        //SIze
        System.out.println("Size of map is : "+map.size());

        //Search
        if (map.containsKey("China")){
            System.out.println("Key is Present in the Map");
        }
        else {
            System.out.println("Key is Not Present in the Map");
        }

        System.out.println(map.get("China")); //value if exist
        System.out.println(map.get("Indo")); //null if not exist

        //Iteration (1)
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Iteration (2)
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        //Delete
        map.remove("China");
        System.out.println(map);
    }
}
