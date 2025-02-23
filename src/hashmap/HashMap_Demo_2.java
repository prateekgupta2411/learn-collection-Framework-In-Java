package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo_2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name", "Prateek");
        map.put("city", "Delhi");

        // Key "name" exists in the map
        System.out.println(map.getOrDefault("name", "Default Name")); // Output: Prateek

        // Key "country" does not exist in the map
        System.out.println(map.getOrDefault("country", "India")); // Output: India
    }
}
