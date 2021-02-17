package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lambda {
    public static void main(String[] args) {
        //Cache memory
        //---> it temporary stores information within 1 program run
        //collections usually referred through cache memory
        Set<String> plateNums = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a new plate number");
            if (!plateNums.add(sc.nextLine())) {
                System.out.println("The plate number is taken");
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a new plate number");
            plateNums.add(sc.nextLine());
        }
        System.out.println(plateNums);

        //write  a logic which would print out  "IL1234" if it exists in the set
        // way 1 ---> BETTER WAY!
        for(String element : plateNums){
            if(element.endsWith("Il1234")){
                System.out.println("IL1234");
            }
        }

        //Printing out every single element in a new line
        //Lambda and streams
        //works only with collections (List/Set)
        plateNums.forEach(System.out::println);


        // way 2
        if(plateNums.contains("IL1234")){
            System.out.println("IL1234");
        }
    }


}
