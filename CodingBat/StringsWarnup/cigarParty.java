package CodingBat.StringsWarnup;

public class cigarParty {
    public static void main(String[] args){
        cigarParty(44,true);

    }
    public static boolean cigarParty(int cigars, boolean isWeekend){
        if((cigars >= 40 && cigars <= 60 && !isWeekend) || (isWeekend && cigars >= 40)){
            return true;
        }
        return false;
    }
}
