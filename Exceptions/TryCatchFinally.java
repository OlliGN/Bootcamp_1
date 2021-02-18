package Exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {

        //Why do we need it?
        //
        try {
            WriteFile.writeToFile("Try block");
            System.out.println("Try block");
        } catch (Exception e) {
            System.out.println("Exception block");
        } finally {
            System.out.println("Finally block");
        }
    }
}
