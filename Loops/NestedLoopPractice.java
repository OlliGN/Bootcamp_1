package Loops;

public class NestedLoopPractice {
    public static void main(String[] args) {
        checkForDuplicate("abba");

    }

    public static boolean checkForDuplicate(String word) {
        if (word.length() % 2 == 0) {
            for (int i = 0; i <= word.length(); i++) {
                for (int o = i + 1; o <= word.length(); o++) {
                    if (word.charAt(i) == word.charAt(o)) {
                        return true;
                    }
                }
            }
        }
        return true;
    }
}
//Write a function which checks if each character in
//the String has at least one duplicate character

//