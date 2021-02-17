package CodingBat.StringsWarnup;

public class missingChar {
    public static void main(String[] args){
       System.out.print(missingChar("", 7));
    }
    public static String missingChar(String str, int n){
        if(str.length() != 0){
            return str.substring(0, n)+(str.substring(n+1));
            }
        return "String can not be empty";
        }
}
