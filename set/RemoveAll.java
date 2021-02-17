package set;

import java.util.HashSet;
import java.util.Set;

public class RemoveAll {
    public static void main(String[] args){
        Set<String> SDETCurriculum = new HashSet<>();
        SDETCurriculum.add("Selenium");
        SDETCurriculum.add("RestApi");
        SDETCurriculum.add("Jenkins");
        SDETCurriculum.add("Java");
        SDETCurriculum.add("Git");
        SDETCurriculum.add("TestNj");
        SDETCurriculum.add("Unix");
        SDETCurriculum.add("Junit");

        Set<String > completedTools = new HashSet<>();
        completedTools.add("Unix");
        completedTools.add("Junit");

        SDETCurriculum.removeAll(completedTools);
        System.out.println(SDETCurriculum);

    }
}
