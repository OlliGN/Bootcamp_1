package CodingBat.StringsWarnup;

public class monkeyTrouble {
    public static  void main(String[] args){
        monkeyTrouble(false, true);

    }
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        if((aSmile && bSmile) || (!aSmile && !bSmile)){
            System.out.println("You are in trouble!");
            return true;
        }
        else{
            System.out.println("You are safe!");
            return false;
        }
    }
}
