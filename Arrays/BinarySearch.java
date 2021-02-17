package Arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] messiGoalsInLastDecadePerYear = {47, 53, 73, 60, 41, 58, 41, 54, 45, 51, 30};
        Arrays.sort(messiGoalsInLastDecadePerYear);
        //returns an int (index) of the element
        int index = Arrays.binarySearch(messiGoalsInLastDecadePerYear, 54);
        System.out.println(index);
        System.out.println(Arrays.toString(messiGoalsInLastDecadePerYear));

        System.out.println(Arrays.binarySearch(messiGoalsInLastDecadePerYear, 47));
        System.out.println(Arrays.binarySearch(messiGoalsInLastDecadePerYear, 563));
    }
}
