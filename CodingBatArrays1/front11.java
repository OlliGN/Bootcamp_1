package CodingBatArrays1;

import java.util.Arrays;

public class front11 {
    public static void main(String[] args) {
        int[] a = {12,3};
        int[] b = {4,2};
        System.out.println(Arrays.toString(front11(a, b)));

    }

    public static int[] front11(int[] a, int[] b) {
       if(a.length != 0 && b.length != 0 ){
           int[] ab = {a[0], b[0]};
           return ab;
       }else if(a.length < 1 && b.length >= 1){
           int[] ab = {b[0]};
           return ab;
       }else if(b.length < 1 && a.length >= 1){
           int[] ab = {a[0]};
           return ab;
       }
       int[] ab = {};
       return ab;
    }
}
