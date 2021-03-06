package Exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {

        //Why do we need it?
        //finally is a block  of code which can be placed after try or catch block.
        // Finally block runs regardless whether the exception was thrown or not.

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
