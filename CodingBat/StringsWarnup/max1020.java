package CodingBat.StringsWarnup;

public class max1020 {
    public static void main(String[] args) {
        System.out.print(max1020(10,21));

    }

    public static int max1020(int a, int b) {
        boolean a1 = (a >= 10 && a <= 20);
        boolean b1 = (b >= 10 && b <= 20);
        if (a1 && b1) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        } else if (a1 && !b1) {
            return a;
        } else if(b1 && !a1) {
            return b;
        }
        return 0;
    }
}
