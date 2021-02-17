package CodingBat.StringsWarnup;

public class extraEnd {
    public static void main(String[] args) {
        System.out.println(extraEnd("hello"));

    }
    public static String extraEnd(String str){
       String one1 = str.substring(str.length() - 2);
       return one1.repeat(3);
    }
}
