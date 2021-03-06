package CodingBatLogic1;

import java.util.Locale;

public class fizzString {
    public static void main(String[] args) {
        String str = "irmab";
        System.out.println(fizzString(str));

    }

    public static String fizzString(String str) {
        if (str.toLowerCase(Locale.ROOT).startsWith("f")) {
            if (str.toLowerCase(Locale.ROOT).startsWith("f") && str.endsWith("b")) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (str.toLowerCase(Locale.ROOT).endsWith("b")) {
            return "Buzz";
        }
        return str;
    }
}
