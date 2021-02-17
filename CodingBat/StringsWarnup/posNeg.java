package CodingBat.StringsWarnup;

public class posNeg {
    public static void main(String[] args) {
        System.out.print(posNeg(-1, -2, false));
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (!negative) {
            if ((a < 0 && b > 0) || (b < 0 && a > 0)) {
                return true;
            }
        } else if (negative) {
            if (a < 0 && b < 0) {
                return true;
            }
        }
        return false;
    }
}
