package CodingBat.StringsWarnup;

public class or35 {
    public static void main(String[] args){
        System.out.print(or35(13));

    }
    public static boolean or35(int n){
        if(n % 3 == 0 || n % 5 == 0){
            return true;
        }
        return false;
    }
}
