package CodingBat.StringsWarnup;

public class in1020 {
    public static void main(String[] args){
        System.out.print(in1020(12,43));

    }
    public static boolean in1020(int a, int b){
        if((a >= 10 && a <= 20) || (b >= 10 && b <= 20)){
            return true;
        }
        return false;
    }
}
