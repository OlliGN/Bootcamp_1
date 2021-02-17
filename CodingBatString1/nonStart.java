package CodingBatString1;

public class nonStart {
    public static void main(String[] args){
        System.out.print(nonStart("Hello", "There"));

    }
    public static String nonStart(String a, String b){
        return a.substring(1).concat(b.substring(1));
    }
}
