package CodingBatMap1;

import java.util.HashMap;
import java.util.Map;

public class mapAB {
    public static void main(String [] args){
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");

        System.out.println(mapAB(map));

    }
    public static Map<String, String > mapAB(Map<String, String> map){
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab", map.get("a")+map.get("b"));
        }
        return map;
    }
}
