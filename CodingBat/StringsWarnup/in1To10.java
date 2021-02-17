package CodingBat.StringsWarnup;

public class in1To10 {
    public static void main (String[] args){
        System.out.println(in1To10(10, true));

    }
    public static boolean in1To10(int n, boolean outsideMode){
        if((!outsideMode && n >= 1 && n <= 10) || (outsideMode && n <= 1) || (outsideMode && n >= 10)){
            return true;
        }
        return false;

    }
}
