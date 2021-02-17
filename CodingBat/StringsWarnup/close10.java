package CodingBat.StringsWarnup;

public class close10 {
    public static void main(String[] args){
        System.out.print(close10(7,13));

    }
    public static int close10(int a, int b) {
        int a1 = a - 10; //2
        int b1 = b - 10; //3
        if( Math.abs(a1) < Math.abs(b1)){
            return a;
        }
        else if( Math.abs(b1) < Math.abs(a1)) {
            return b;
        }
        return 0;
    }
}
