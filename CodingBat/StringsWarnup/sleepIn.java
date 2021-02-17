package CodingBat.StringsWarnup;

public class sleepIn {
    public static void main(String[] args){
        sleepIn(true,false);

    }
    public static boolean sleepIn(boolean weekday, boolean vacation){
        if(!weekday || vacation){
            return true;
        }
        else{
            return false;
        }
    }
}
