package CodingBat.StringsWarnup;

public class notString {
    public static void main(String[] args) {
        System.out.print(notString("x"));

    }

    public static String notString(String str) {
        if (str.length() >= 3) {
            if (!str.substring(0, 3).equals("not")) {
                String not = "not ";
                return not.concat(str);
            }
        } else if (str.length() < 3) {
            String not = "not ";
            return not.concat(str);
        }
        return str;
    }
}
