package CodingBatString1;

public class twoChar {
    public static void main(String[] args){
        System.out.println(twoChar ("java", 2));

    }
    public static String twoChar(String str, int index){
        if(index < 0 || index >= str.length() || str.length() - index == 1){
            return str.substring(0,2);
        }
        return str.substring(index, index+2);
    }
}
