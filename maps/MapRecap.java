package maps;

import java.util.HashMap;
import java.util.Map;

public class MapRecap {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();

        map.put(100, "Jon Doe");
        map.put(200, "Elon Mask");

        //.replace - will replace the value only if the key are exist, if not - that will not do anything
        map.replace(120, "Keks");//this is the same as

        if(map.containsKey(120)) { // This
            map.put(120, "Melinda");
        }
        System.out.println(map);
    }
}
