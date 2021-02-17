package CodingBat.StringsWarnup;

public class stringE {
    public static void main(String[] args) {
        System.out.print(stringE("helle"));

    }

    public static boolean stringE(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                counter++;
            }
        }
        if (counter >= 1 && counter <= 3){
            return true;
        }
        return false;
    }
}
