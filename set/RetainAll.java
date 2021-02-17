package set;

import javax.swing.text.Style;
import java.util.HashSet;
import java.util.Set;

public class RetainAll {
    public static void main(String[] args){
        //add matching elements
        Set<String> player1Selection = new HashSet<>();
        player1Selection.add("Elon");
        player1Selection.add("Bezos");
        player1Selection.add("Marry");
        player1Selection.add("Jane");
        player1Selection.add("Joe");

        Set<String> player2Selection = new HashSet<>();
        player2Selection.add("Elon");
        player2Selection.add("Bezoso");
        player2Selection.add("Mariana");
        player2Selection.add("Janne");
        player2Selection.add("Ross");
        player2Selection.add("Julie");
        player1Selection.add("Joe");

        player1Selection.retainAll(player2Selection);
        System.out.println(player1Selection);
    }
}
