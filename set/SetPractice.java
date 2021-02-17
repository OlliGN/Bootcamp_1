package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Elon");
        names.add("Bezos");
        names.add("Marry");
        names.add("Jane");
        names.add("Joe");

        names.remove("Jane");
        names.add("Cale");
        System.out.println(names);

        Set<StringBuilder> employees = new HashSet<>();
        employees.add(new StringBuilder("Elon"));
        employees.add(new StringBuilder("Ross"));
        employees.add(new StringBuilder("Kex"));
        employees.add(new StringBuilder("Ilona"));
        System.out.println(employees);

        Iterator<StringBuilder> it = employees.iterator();

        while (it.hasNext()) {
            StringBuilder elon = it.next();
            if (elon.toString().equals("Elon")) {
                elon.append(" Mask");
            }
        }
        System.out.println(employees);

    }
}
