package CodingBatArrays1;

public class commonEnd {
    public static void main(String[] args){

    }
    public boolean commonEnd(int[]a, int[]b){
        return a[0] == b[0] || a[a.length-1] == b[b.length-1] && a.length >= 1 && b.length >= 1;
    }
}
