package CodingBatMap1;

import java.util.Map;

public class topping3 {
    public static void main(String[] args) {

    }

    public static Map<String, String> topping3(Map<String, String> map){
        if(map.containsKey("potato")){
            map.put("fries", map.get("potato"));
        }
        if(map.containsKey("salad")){
            map.put("spinach", map.get("salad"));
        }
        return map;
    }
}
