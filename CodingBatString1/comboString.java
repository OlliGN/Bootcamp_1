package CodingBatString1;

public class comboString {
    public static void  main(String[] args){
        System.out.print(comboString("hi", "hello"));
    }
    public static String comboString(String a, String b){
        if(a.length() < b.length()){
            return a.concat(b.concat(a));
        }
        return b.concat(a.concat(b));
    }
}
