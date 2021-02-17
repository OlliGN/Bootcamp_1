package CodingBat.StringsWarnup;

public class icyHot {
    public static void main(String[] args){
        System.out.print(icyHot(-1,100));

    }
    public static boolean icyHot(int temp1, int temp2){
        if( (temp1 < 1 || temp2 < 1) && (temp1 > 100 || temp2 > 100)){
            return true;
        }
        return false;
    }
}
