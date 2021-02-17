package CodingBatArrays1;

import java.util.Arrays;

public class plusTwo {
    public static void main(String[] args){
        int[] a = {1,2};
        int[] b = {1,2};
        System.out.println(Arrays.toString(plusTwo(a, b)));

    }
    public static int[] plusTwo(int[] a, int[] b){
        int[] ab = {a[0], a[1], b[0], b[1]};
        return ab;
    }
}
