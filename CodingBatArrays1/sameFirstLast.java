package CodingBatArrays1;

public class sameFirstLast {
    public static void main(String[] args){
        int[] num = {12,12,32,34,12};
        System.out.println(sameFirstLast(num));
    }
    public static boolean sameFirstLast(int[] num){
        return num.length >= 1 && num[0] == num[num.length-1];
    }
}
