package Exceptions;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your fav number?");

        try{
            int n = sc.nextInt();
            System.out.println(n);
        } catch (Exception e){
            System.out.println("Sorry, please enter a number!");
        }
    }
}
