package CodingBat.StringsWarnup;

public class parrotTrouble {
    public static void main(String[] args) {
        parrotTrouble(true, 22);

    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        if ((talking && hour < 7) || (talking && hour > 20)) {
            return true;
        } else {
            return false;
        }


    }
}
