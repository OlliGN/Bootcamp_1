package Exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        writeToFile("jjj", "jdjdj.txt");
    }

    //throws keyword declares in the method signature: I want the method that I call writeToFile method to handle the issue
    public static void writeToFile(String txt) throws IOException {
        FileWriter fileWriter = new FileWriter("src/Exceptions/test.txt", true);
        fileWriter.write(txt);
        fileWriter.close();
    }

    public static void writeToFile(String txt, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            fileWriter.write(txt);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("In catch block");
            System.out.println("Wrong path to a file");
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
