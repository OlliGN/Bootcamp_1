package Loops;

public class breakStatement {
    public static void main(String[] args){
        String str = "DevX School";
        for (int i = 0; i < str.length(); i++ ){
            if(str.charAt(i) == 'h'){
                System.out.println("I found it!");
            }
        }
    }
}
