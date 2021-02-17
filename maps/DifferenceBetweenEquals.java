package maps;

import java.util.ArrayList;
import java.util.List;

public class DifferenceBetweenEquals {
    public static void main(String[] args) {
        //Every non primitive datatype (every class) in Java has equals() method
        //Equals() method comes from Object class
        //Object class is the GodFather of all classes, that means every class in Java has method
        //that are created in object class

        Object o = new Object();
        o.equals("sdf");
        o.hashCode();
        o.toString();

        String str = "gdf";
        str.equals("sfgh");
        str.hashCode();
        str.toString();

        //equals() ---> is same as ==;
        // equals() ---> can be used only with non-null objects
        // we can not use equals(null);


        StringBuilder sb = new StringBuilder("gfd");
        StringBuilder fg1 = new StringBuilder("gfd");
        sb.equals("ed");


        //String.equals()   ---> is differents
        //it checks if the values are equal

        String gf = new String("Hello World");//true - bc String.equals() checks if the spelling is the same
        String fg = new String("Hello World");// false - bc in this case equals() is the same as == and
        // == checks if two references are pointing to the same Object in the Heap
        System.out.println(gf.equals(fg));
        System.out.println(sb.equals(fg1));
        System.out.println(gf == fg);

        List<String > abs = new ArrayList<>();
        abs.add("qa");
        abs.add("qaa");
        abs.add("qaaa");

        List<String > abs2 = new ArrayList<>();
        abs2.add("qa");
        abs2.add("qaa");
        abs2.add("qaaa");

        System.out.println(abs.equals(abs2));

    }
}
