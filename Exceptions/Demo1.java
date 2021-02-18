package Exceptions;

import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        WriteFile.writeToFile("Hello world!");

        try {
            WriteFile.writeToFile("Hello world");

        } catch (IOException e) {
            throw new IOException("Error Writing to Hello World");
        }

        //bunch of code
        //bunch of code
        //bunch of code
        //bunch of code
        //bunch of code

        try {
            WriteFile.writeToFile("Good buy world");

        } catch (IOException e) {
            throw new IOException("Error Writing Good buy world");
        }
    }
}
