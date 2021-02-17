package CodingBatArrays1;

import java.util.Arrays;

public class biggerTwo {
    public static void main(String[] args) {
        int[] a = {1, 1};
        int[] b = {1, 1};
        System.out.println(Arrays.toString(biggerTwo(a, b)));

    }

    public static int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];

        if (sumA >= sumB) {
            return a;
        }
        return b;

    }
}
