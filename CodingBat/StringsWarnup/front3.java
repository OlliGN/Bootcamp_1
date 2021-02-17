package CodingBat.StringsWarnup;

public class front3 {
    public static void main(String[] args){
        System.out.print(front3("Ho"));

    }
    public static String front3(String str){
        String a;
        if(str.length() >= 3){
            a = str.substring(0,3);
        }else{
            a = str;
        }
        return str+str+str;
    }
}
