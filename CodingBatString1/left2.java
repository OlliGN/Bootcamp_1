package CodingBatString1;

public class left2 {
    public static void main(String[] args){
        System.out.println(left2("He"));

    }
    public static String left2(String str){
      return str.substring(2).concat(str.substring(0,2));
    }
}
