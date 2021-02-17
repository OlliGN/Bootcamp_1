package maps;

import java.util.AbstractMap;
import java.util.Map;

public class MapEntryClass {
    public static void main(String[] args) {
        //Map.Entry is an interface(data type) that represents one entry(key value pair) in a Map
        //one Entry(key value pair) in a map

        Map.Entry<Integer, String> oneEntry = new AbstractMap.SimpleEntry<Integer, String>(120, "Jon Doe");
        System.out.println(oneEntry.getKey());
        System.out.println(oneEntry.getValue());

    }
}
