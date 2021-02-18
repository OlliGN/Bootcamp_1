package Exceptions;

public class ThrowKeyword2 {
    public static void main(String[] args) {
//        throw  new IndexOutOfBoundsException("Bla bla bla");
        try {
            throw new Exception("bla bla");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
