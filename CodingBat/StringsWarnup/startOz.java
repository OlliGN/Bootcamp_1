package CodingBat.StringsWarnup;

public class startOz {
    public static void main (String [] args){
        System.out.print(startOz("o343"));

    }
    public static String startOz(String str){
        if(str.length() > 1) {
            if (str.substring(0, 2).equals("oz")) {
                return str.substring(0, 2);
            } else if (str.substring(0, 1).equals("o")) {
                return str.substring(0, 1);
            } else if (str.substring(1, 2).equals("z")) {
                return str.substring(1, 2);
            }
        }
       else if(str.length() == 1 && str.substring(0).equals("o")){
           return str;
        }
       return "";
    }
}
