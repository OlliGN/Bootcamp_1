package CodingBatMap1;

import java.util.HashMap;
import java.util.Map;

public class mapAB4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bb");
        map.put("c", "cake");
        System.out.println(mapAB4(map));

    }

    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String a = map.get("a");
            String b = map.get("b");
            if (a.length() > b.length()) {
                map.put("c", map.get("a"));
            } else if (b.length() > a.length()) {
                map.put("c", map.get("b"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}


/*
if(map.get("a".length()) == map.get("b".length())){
            map.put("a", "");
            map.put("b", "");
        }else if(map.get("a".length()))
 */