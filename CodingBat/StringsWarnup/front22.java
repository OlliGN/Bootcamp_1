package CodingBat.StringsWarnup;

public class front22 {
    public static void main(String[] args){
        System.out.print(front22("kitten"));

    }
    public static String front22(String str){
        String a;
        if(str.length() >= 2){
           a = str.substring(0,2);
           return a.concat(str.concat(a));
        }
        return str+str+str;
    }
}
