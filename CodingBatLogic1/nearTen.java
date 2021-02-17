package CodingBatLogic1;

public class nearTen {
    public static void main(String[] args) {
        System.out.println(nearTen(12));

    }

    public static boolean nearTen(int num) {
        if (num % 10 == 0 || num % 10 == 2 || num % 10 == 1 || num % 10 == 8 || num % 10 == 9) {
            return true;
        }
        return false;
    }
}
