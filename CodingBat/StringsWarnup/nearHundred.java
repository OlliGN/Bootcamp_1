package CodingBat.StringsWarnup;

public class nearHundred {
    public static void main(String[] args){

    }
    public static boolean nearHundred(int n){
        if((n >= 90 && n <=100) || (n >= 100 && n <= 110)){
            return true;
        } else if ((n >=190 && n <= 200) || (n >= 200 && n <= 210)){
            return true;
        }
        else{
            return false;
        }
    }
}
