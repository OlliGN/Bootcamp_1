package CodingBat.StringsWarnup;

//Given two non-negative int values, return true if they have the same last digit,
// such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

public class lastDigit {
    public static void main (String[] args){
        System.out.print(lastDigit(11222, 1212));
        System.out.print(lastDigitBetter(11222,1212));

    }
    public static boolean lastDigit(int a, int b){
        String stringA = Integer.toString(a);
        String stringB = Integer.toString(b);

        if((stringA.charAt(stringA.length()-1)) == ((stringB.charAt(stringB.length()-1)))){
            return true;
        }
        return false;
    }
    public static boolean lastDigitBetter(int a, int b){
        return (a % 10 == b % 10);
    }
}
