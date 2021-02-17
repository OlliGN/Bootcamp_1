package CodingBatString1;

public class middleThree{
    public static void main(String [] args){
        String str = "moloRko";
        System.out.println(middleThree(str));

    }
    public static String middleThree(String str){
        if(str.length() > 3){
            return str.substring((str.length()/2)-1, (str.length()/2)+2);
        }
        return str;
    }
}
