package Lists;

public class wrapperClasses {
    public static void main(String[] args) {
        //int -> Integer
        Integer num1 = new Integer(12);
        System.out.println(num1);

        //Autoboxing -> when you assign literal value to corresponding Wrapper classes
        Integer num2 = 12;

        //Unboxing - when assigning a wrapper class value to a primitive datatype
        int num3 = num2;

        Character ch = 'D';

        String year = "1234";
        int yearInt = Integer.parseInt(year);
        yearInt/=2;
    }
}
