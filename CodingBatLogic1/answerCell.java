package CodingBatLogic1;

public class answerCell {
    public static void main(String[] args){

    }
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep){
        if(isAsleep){
            return false;
        }
        else if(isMorning && isMom){
            return true;
        }
        return true;
    }
}
