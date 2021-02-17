package maps;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class countNumberOfCharOccurrences {
    public static void main(String[] args) {
        //create a program which will calculate the number occurrences of each character in a String

        String word = "Hello world, I love you!";
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase(Locale.ROOT).charAt(i) == 'l') {
                counter++;
            }
        }
        //System.out.println(counter);

        //System.out.println(charOccur(word)); //call the charOccur method

        //create a map with all the characters From the String
        String word2 = "Hello world";
        Map<Integer, Character> mapOfChars = new HashMap<>();
        for (int i = 0; i < word2.length(); i++) {
            mapOfChars.put(i, word.charAt(i));
        }
        System.out.println(mapOfChars);
    }

    //Method that count how many times the char occurs in the String
    public static Map<Character, Integer> charOccur(String word) {

        Map<Character, Integer> countOccur = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (!countOccur.containsKey(word.charAt(i))) {
                countOccur.put(word.charAt(i), 1);
            } else {
                int value = countOccur.get(word.charAt(i));
                countOccur.put(word.charAt(i), value+1);
            }
        }
        return countOccur;
    }
}