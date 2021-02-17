package CodingBatString1;

public class hasBad {
    public static void main(String[] args){
        String str = "bad";
        System.out.println(hasBad(str));

    }
    public static boolean hasBad(String str){
        if(str.length() > 3){
            return str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad");
        }else if(str.length() == 3){
            return str.equals("bad");
        }
        return false;
    }
}
