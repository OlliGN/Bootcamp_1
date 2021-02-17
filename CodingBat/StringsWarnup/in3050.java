package CodingBat.StringsWarnup;

public class in3050 {
    public static void main(String[] args){
        System.out.print(in3050(34,35));

    }
    public static boolean in3050(int a, int b){
        if(((a >= 30 && a <=40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <=50) && (b >= 40 && b <= 50))) {
            return true;
        }
        return false;
    }
}
