import java.util.HashMap;
import java.util.Set;

/**
 * Hashmap_Example_1
 */
public class Hashmap_Example_1 {

    public static void main(String[] args) {
        HashMap<String,Integer> hashmap = new HashMap<>();
        hashmap.put("India",135);
        hashmap.put("America",200);
        hashmap.put("london",150);
        System.out.println(hashmap);
        hashmap.put("Nigeria",100);
        hashmap.put("America",198);
        System.out.println(hashmap);
        System.out.println(hashmap.containsKey("India"));
        System.out.println(hashmap.get("India"));
        System.out.println();
        Set<String> keys = hashmap.keySet();
        for (String key : keys) {
            System.out.println(key+"--->"+hashmap.get(key));
        }
    }
}