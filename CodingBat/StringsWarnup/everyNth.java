package CodingBat.StringsWarnup;

public class everyNth {
    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2));

    }

    public static String everyNth(String str, int n) {
        String word = "";
        for (int i = 0; i < str.length(); i = i + n) {
            word = word.concat(str.substring(i, i+1));
        }
        return word;
    }
}
