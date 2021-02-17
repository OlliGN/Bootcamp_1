package CodingBat.StringsWarnup;

public class sortaSum {
    public static void main(String[] args){
        System.out.println(sortaSum(1,1));

    }
    public static int sortaSum(int a, int b){
        int sum = a + b;
        if(sum >= 10 && sum <= 20){
            return 20;
        }
        return sum;
    }
}
