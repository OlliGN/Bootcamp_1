package CodingBatLogic1;

public class teaParty {
    public static void main(String[] args) {
        System.out.println(teaParty(20, 6));

    }

    public static int teaParty(int tea, int candy) {
        if (tea >= 5 && candy >= 5) {
            if (tea >= candy * 2 || candy >= tea * 2) {
                return 2;
            }
            return 1;
        }
        return 0;
    }
}
