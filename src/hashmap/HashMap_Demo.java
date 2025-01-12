package hashmap;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class HashMap_Demo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(11, "Prateek");
        map.put(2, "Ritik");
        map.put(3, "Shiva");

        System.out.println(map); // Prints the entire map
        System.out.println(map.get(3)); // Prints the value for key 3
        System.out.println(map.get(10)); // Prints null since key 10 doesn't exist
        System.out.println(map.containsKey(11)); // Checks if key 11 exists
        System.out.println(map.containsValue("Prateek")); // Checks if value "Prateek" exists

        // Iterate through keys using keySet()
        for (int i : map.keySet()) {
            System.out.println(map.get(i));
        }

        // Iterate through entries using entrySet()
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
            System.out.println(entry.getValue().toUpperCase());
        }
        System.out.println(map);
        map.remove(11);
        System.out.println(map);
    }
}
