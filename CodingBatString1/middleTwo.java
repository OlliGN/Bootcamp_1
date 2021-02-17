package CodingBatString1;

public class middleTwo {
    public static void main(String[] args){
        System.out.println(middleTwo("Practice"));

    }
    public static String middleTwo(String str){
        if(str.length() >=2){
            String one = str.substring(0,str.length()/2);
            String two = str.substring(str.length()/2);
            return one.substring(one.length()-1).concat(two.substring(0,1));
        }
        return str;
    }
}
