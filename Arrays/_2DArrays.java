package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _2DArrays {
    public static void main(String[] args) {
        String[][] employees = new String[4][];
        employees[0] = new String[]{"Elon Musk", "Steve Jobs", "Larry Page", "Alex Brian", "Melanie Perkins"};
        employees[1] = new String[]{"John Doe", "Grand Cardone", "Jeff Bezos"};
        employees[2] = new String[]{"Jane Doe", "Kevin Hart", "Bekham"};
        employees[3] = new String[]{"Torontino", "Askar", "Hemant", "Ravindra"};

        System.out.println("Choose from following options: 0 / 1 / 2 / 3");

       Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        //find an element in Array
        if (choice == 0) {
            for (int i = 0; i < employees[choice].length; i++) {
                System.out.println((employees[choice][i]));
            }
        }


        delete(employees, "Larry Page");
        System.out.println(Arrays.deepToString(employees));

    }
    //delete element from Array
    public static void delete(String[][] employees, String names){
        for(int i = 0; i < employees.length; i++){
            for(int j = 0; j < employees[i].length; j++){
                if(employees[i][j].equals((names))){
                    employees[i][j] = "";
                }
            }
        }
    }
}
