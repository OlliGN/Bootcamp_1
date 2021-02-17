package CodingBat.StringsWarnup;

public class makeAbba {
    public static void main(String[] args){
        System.out.println(makeAbba("lol","bob"));

    }
    public static String makeAbba(String a, String b){
        return a+b+b+a;
    }
}
