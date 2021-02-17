package CodingBat.StringsWarnup;

public class frontBack {
    public static void main(String[] args){
        System.out.print(frontBack("a"));

    }
    public static String frontBack(String str){
        if( str.length() >= 2 ) {
            String a = str.substring(0, 1);
            String b = str.substring(str.length() - 1);
            String c = str.substring(1, str.length() - 1);
            return b + c + a;
        }
        return str;
    }
}



   // String one =  str.substring(0, str.length()/2);
   // String two = str.substring(one.length());
    //    return two.concat(one);