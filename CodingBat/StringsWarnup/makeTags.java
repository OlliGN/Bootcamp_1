package CodingBat.StringsWarnup;

public class makeTags {
    public static void main(String[] args){
        System.out.println(makeTags("i", "i"));

    }
    public static String makeTags(String tag, String word){
        return "<" + tag + ">"+ word + "</" + tag + ">" ;
    }
}
