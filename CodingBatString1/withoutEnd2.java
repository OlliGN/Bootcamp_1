package CodingBatString1;

public class withoutEnd2 {
    public static void main(String[] args) {
        System.out.println(withoutEnd2("i"));

    }

    public static String withoutEnd2(String str) {
        if (str.length() >= 2) {
            return str.substring(1, str.length() - 1);
        }
        return "";
    }
}
