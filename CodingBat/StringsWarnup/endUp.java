package CodingBat.StringsWarnup;

import java.util.Locale;

public class endUp {
    public static void main (String [] args){
        System.out.print(endUp("I am a cat"));

    }
    public static String endUp(String str) {
        if (str.length() >= 3) {
            String up = str.substring(str.length() - 3).toUpperCase(Locale.ROOT);
            return str.substring(0,str.length()-3).concat(up);
        }
        return str.toUpperCase(Locale.ROOT);
    }
}
