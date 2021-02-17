package CodingBatMap2;

import java.util.HashMap;
import java.util.Map;

public class firstChar {
    public static void main(String[] args) {
        String[] strings = {"toast", "tv", "tort", "tea", "a", "a"};

        System.out.println(firstChar(strings));

    }

    //key ---> first char seen
    //value ---> value of all the strings starting with that character appended together in the order they appear in the array.
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i].substring(0, 1))) {
                for (String y : strings) {
                    map.put(strings[i].substring(0, 1), strings[i]);

                    if (y.startsWith(strings[i].substring(0,1))) {
                        map.put(strings[i].substring(0, 1), strings[i].concat(y));
                    }
                }
            }
        }
        return map;
    }
}
