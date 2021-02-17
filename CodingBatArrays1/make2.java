package CodingBatArrays1;

import java.util.Arrays;

public class make2 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {1,2,3};
        System.out.println(Arrays.toString(make2(a, b)));

    }

    public static int[] make2(int[] a, int[] b) {
        if (a.length < 1 && b.length >= 2) {
            int[] newA = {b[0], b[1]};
            return newA;
        } else if (a.length == 1) {
            int[] newA = {a[0], b[0]};
            return newA;
        }
        int[] a1 = {a[0], a[1]};
        return a1;
    }
}
