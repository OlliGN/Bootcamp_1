package CodingBatMap1;

import java.util.HashMap;
import java.util.Map;

public class topping1 {
    public static void main(String [] args){
        Map<String, String >map = new HashMap<>();
        map.put("ive cream", "butter");

    }
    public static Map<String, String> topping1(Map<String, String> map){
        map.put("bread", "butter");
        if(map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        return map;
    }
}
