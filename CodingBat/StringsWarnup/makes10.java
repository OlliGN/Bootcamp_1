package CodingBat.StringsWarnup;

public class makes10 {
    public static void main(String[] args){
        makes10(21, 33);
    }
    public static boolean makes10(int a, int b){
        if(a == 10 || b == 10 || a+b == 10){
            return true;
        }
        else{
            return false;
        }
    }
}
