package CodingBat.StringsWarnup;

public class makeOutWord {
    public static void main(String[] args){
        System.out.println(makeOutWord("<<>>", "Words"));

    }
    public static String makeOutWord(String out, String word){
        return out.substring(0,2)+word+out.substring(2);
    }

}
