package CodingBatMap2;

import java.util.HashMap;
import java.util.Map;

public class pairs {
    public static void main(String[] args){
        String[] strings = {"codeqqqq9", "bug"};
        System.out.println(pairs(strings));

    }
    public static Map<String, String> pairs(String[] strings){
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++){
            map.put(strings[i].substring(0,1), strings[i].substring(strings[i].length()-1) );
        }
        return map;
    }
}
