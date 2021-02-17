package CodingBatString1;
import java.util.Scanner;

public class nTwice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println(nTwice(str, n));

    }
    public static String nTwice(String str, int n){
        return str.substring(0,n).concat(str.substring(str.length()-n));
    }
}
