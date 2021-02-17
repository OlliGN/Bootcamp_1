package CodingBatMap1;

import java.util.HashMap;
import java.util.Map;

public class mapShare {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        map.put("d", "ddd");

        System.out.println(mapShare(map));

    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("c")) {
            map.remove("c");
        }
        if(!map.containsKey("b")){
            map.put("b", map.get("a"));
        }
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("b", map.get("a"));
        }
        return map;
    }

    public static class mapBully {
        public static void main(String[] args){
            Map<String, String> map = new HashMap<>();
            map.put("a", "");
            map.put("b", "dirt");
            System.out.println(mapBully(map));
        }
        public static Map<String, String > mapBully(Map<String, String> map){
            if(map.containsKey("a") && !map.get("a").isEmpty()){
                map.put("b", map.get("a"));
                map.put("a", "");
            }
            return map;
        }
    }
}
