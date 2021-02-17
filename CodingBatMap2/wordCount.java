package CodingBatMap2;

import java.util.HashMap;
import java.util.Map;

public class wordCount {
    public static void main(String[] args) {
        String[] strings = {"lol", "lol", "a", "c", "b", "d"};
        System.out.println(wordCount(strings));

    }

    //key - string
    //value - number of times that string appears in the array.

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], 1);
            } else {
                int value = map.get(strings[i]);
                map.put(strings[i], value+1);
            }
        }
        return map;
    }
}
