package CodingBat.StringsWarnup;

public class squirrelsPlay {
    static public void main(String[] args){
        squirrelPlay(100,true);

    }
    public static boolean squirrelPlay(int temp, boolean isSummer){
        if(!isSummer && temp >= 60 && temp <= 90){
            return true;
        } else if(isSummer && temp >= 60 && temp <=100){
            return true;
        }
        return false;
    }
}
