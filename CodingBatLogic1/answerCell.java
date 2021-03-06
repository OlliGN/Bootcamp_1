package CodingBatLogic1;

public class answerCell {
    public static void main(String[] args){

    }
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep ){
       if(isAsleep || (isMorning && !isMom)){
           return false;
       }else {
           return true;
       }
    }
}
