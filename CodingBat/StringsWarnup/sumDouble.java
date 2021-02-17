package CodingBat.StringsWarnup;

public class sumDouble {
    public static void main(String[] args){
        sumDouble(3,3);

    }
    public static int sumDouble(int a, int b){
        if(a == b){
            System.out.println((a+b)*2);
            return (a + b)*2;
        }
        else{
            System.out.println(a+b);
            return (a+b);

        }
    }
}
