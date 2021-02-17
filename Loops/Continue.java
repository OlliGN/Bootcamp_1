package Loops;

public class Continue {
    public static void main(String[] args) {
        //continue - used only inside the loops
        //continue meant that current loop will jump to the next loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");

            if (i == 3) {
                continue; //jump to next loop
            }
            System.out.println("Ending of loop " + i);
        }
        for ( int i = 0; i <100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i);
        }
        for (int i = 2000; i < 2030; i++){
            if(i == 2020){
                System.out.println("COVID");
                continue;
            }
            System.out.println("Champion of "+ i + " year!");
        }
    }
}
