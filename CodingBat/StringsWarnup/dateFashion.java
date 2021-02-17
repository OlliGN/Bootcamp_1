package CodingBat.StringsWarnup;

public class dateFashion {
    public static void main(String[] args){
        System.out.println(dateFashion(6,7));

    }
    public static int dateFashion(int you, int date){
        if((you >= 8 || date >= 8) && (you >= 3 && date >= 3) ){
            return 2;
        }else if (you <= 2 || date <= 2){
            return 0;
        }
        return 1;
    }
}
