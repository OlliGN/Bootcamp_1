package CodingBatMap2;

import java.util.HashMap;
import java.util.Map;

public class wordLen {
    public static void main(String[] args){
        String[] strings = {"aalalal", "bb", "a", "bb"};

        System.out.println(wordLen(strings));

    }
    public static Map<String, Integer> wordLen(String [] strings){
        Map<String, Integer> wordLen = new HashMap<>();
        for(int i = 0; i < strings.length; i++){
            wordLen.put(strings[i], strings[i].length());
        }
        return wordLen;
    }
}
