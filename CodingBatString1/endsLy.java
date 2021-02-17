package CodingBatString1;

public class endsLy {
    public static void main(String[] args){

    }
    public static boolean endLy(String str){
        if(str.length() >= 2 && str.substring(str.length()-2).equals("ly")){
            return true;
        }
        return false;
    }
}
