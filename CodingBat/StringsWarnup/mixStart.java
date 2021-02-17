package CodingBat.StringsWarnup;

public class mixStart {
    public static void main(String[] args){
        System.out.print(mixStar("miclol"));

    }
    public static boolean mixStar(String str){
        if( str.length() >= 3 && str.substring(1,3).equals("ix")){
            return true;
        }
        return false;
    }
}
