package CodingBatMap2;

import java.util.HashMap;
import java.util.Map;

public class word0 {
    public static void main(String[] args){
        String[] strings = {"a", "b", "c", "d"};
        System.out.println(word0(strings));

    }
    public static Map<String, Integer> word0(String[] strings){
        Map<String, Integer> word0 = new HashMap<>();
        for(String word : strings){
            word0.put(word, 0);
        }
        return word0;
    }
}
