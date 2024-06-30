import java.util.*;

public class _maps{
    public static void main(String[] args){
        Map<String, String> maps = new HashMap<>();

        maps.put("ind", "india");
        maps.put("us", "united states");
        maps.put("in", "indonesia");

        maps.putIfAbsent("ind", "india");
        System.out.println(maps);

        // Set<String> keys= maps.keySet();
        ArrayList<String> keys= new ArrayList<>(maps.keySet());
        System.out.println(keys);

        Collection<String> value = maps.values();
        System.out.println(value);

        Set<Map.Entry<String, String>> entries= maps.entrySet();
        System.out.println(entries);

        for(Map.Entry<String, String> entry : entries){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // System.out.println(maps.get("us"));
        // System.out.println(maps.getOrDefault("en", "Other country"));

        // System.out.println("key = " + maps.containsKey("us"));

        // System.out.println("value = " + maps.containsValue("india"));
        
        // maps.replace("in", "indonesian_people");
        // System.out.println(maps.get("in"));

        // maps.remove("in");
        // System.out.println(maps);
    }
}