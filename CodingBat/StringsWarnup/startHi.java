package CodingBat.StringsWarnup;

public class startHi {
    public static void main(String[] args) {
        System.out.print(startHi("hifggf"));

    }

    public static boolean startHi(String str) {
        String hi;
        if (str.length() >= 2) {
            hi = str.substring(0, 2);
            if (hi.equals("hi")) {
                return true;
            }
        }
        return false;
    }
}
