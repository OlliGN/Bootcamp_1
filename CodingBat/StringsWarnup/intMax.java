package CodingBat.StringsWarnup;

public class intMax {
    public static void main(String[] args){
        System.out.println(intMax(12,12,13));
        System.out.println(Math.max(12,23));

    }
    public static int intMax(int a, int b, int c){
        if( a > b && a > c){
            return a;
        }
        else if (b > a && b > c){
            return b;
        }
        return c;
    }
}
