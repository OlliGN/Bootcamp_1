package CodingBat.StringsWarnup;

public class hasTeen {
    public static void main(String[] args){
        System.out.print(hasTeen(11,13,44));

    }
    public static boolean hasTeen(int a, int b, int c){
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)){
            return true;
        }
        return false;
    }
}
