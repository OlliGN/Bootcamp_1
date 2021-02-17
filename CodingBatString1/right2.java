package CodingBatString1;

public class right2 {
    public static void main(String[] args){
        System.out.println(right2("java"));

    }
    public static String right2(String str){
        return str.substring(str.length()-2).concat(str.substring(0,str.length()-2));
    }
}
