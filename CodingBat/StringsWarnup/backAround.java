package CodingBat.StringsWarnup;

public class backAround {
    public static void main(String[] args){
        System.out.print(backAround("Hello"));

    }
    public static String backAround(String str){
         String a = str.substring(str.length()-1);
         String b = a.concat(str).concat(a);
         return b;

    }
}
