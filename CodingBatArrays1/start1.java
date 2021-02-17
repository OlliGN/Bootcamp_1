package CodingBatArrays1;

public class start1 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};
        System.out.println(start1(a, b));

    }


    public static int start1(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) {
            if (a[0] == 1) {
                if (b[0] == 1) {
                    return 2;
                }
                return 1;
            } else if (b[0] == 1) {
                if (a[0] == 1) {
                    return 2;
                }
                return 1;
            }

        } else if (a.length<1 && b.length<2) {
            return 0;


        }
        return 0;
    }
}






/* if (a.length > 0) {
            if (b.length > 0) {
                if (a[0] == 1) {
                    if (b[0] == 1) {
                        return 2;
                    }
                    return 1;
                }
            }
            if (a[0] == 1) {
                return 1;
            }

        }
        if (b.length > 0) {
            if (b[0] == 1) {
                return 1;
            }
        }
        return 0;  */