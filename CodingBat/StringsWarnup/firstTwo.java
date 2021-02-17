package CodingBat.StringsWarnup;

public class firstTwo {
    public static void main(String[] args) {
        System.out.println(firstTwo("k"));

    }
    public static String firstTwo(String str){
        if(str.length() >= 2) {
            return str.substring(0, 2);
        }else if( str.length() == 1){
            return str.substring(0);
        }
        return "";
    }
}
