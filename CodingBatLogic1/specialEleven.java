package CodingBatLogic1;

public class specialEleven {
    public static void main(String[] args) {

    }

    public static boolean specialEleven(int n) {
        if (n % 11 == 0 || n % 11 == 1) {
            return true;
        }
        return false;
    }
}
