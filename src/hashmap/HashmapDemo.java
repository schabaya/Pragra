package hashmap;
import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {
        // Creating a hashmap
        HashMap<String, Integer> map = new HashMap<>();

        // Inserting elements (put method)
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Accessing elements (get method)
        System.out.println("Age of Alice: " + map.get("Alice"));

        // Checking if a key exists in the map (containsKey method)
        if (map.containsKey("Bob")) {
            System.out.println("Bob is in the map");
        }

        // Checking if a value exists in the map (containsValue method)
        if (map.containsValue(35)) {
            System.out.println("There is someone who is 35 years old");
        }

        // Removing an element (remove method)
        map.remove("Charlie");
        System.out.println("After removing Charlie: " + map);

        // Iterating over key-value pairs
        System.out.println("Iterating over key-value pairs:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Iterating over keys only
        System.out.println("Iterating over keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // Iterating over values only
        System.out.println("Iterating over values:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // Replacing a value for a given key (replace method)
        map.replace("Alice", 32);
        System.out.println("After replacing Alice's age: " + map);

        // Getting the size of the map (size method)
        System.out.println("Size of the map: " + map.size());

        // Clearing the map (clear method)
        map.clear();
        System.out.println("After clearing the map: " + map);
    }
}

