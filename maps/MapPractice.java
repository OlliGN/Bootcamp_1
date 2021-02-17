package maps;

import java.util.*;


public class MapPractice {
    public static void main(String[] args) {
        Map<Integer, List<String>> candidates = new HashMap<>();

        List<String> company = new ArrayList<>();
        candidates.put(1, company);
        company.add("Google");
        company.add("Apple");
        company.add("Amazon");

        List<String> company1 = new ArrayList<>();
        candidates.put(2, company);
        company1.add("Ford");
        company1.add("Lexus");
        company1.add("Tesla");

        List<String> company3 = new ArrayList<>();
        candidates.put(3, company);
        company3.add("Amazon");
        company3.add("Lexus");
        company3.add("Amazon");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the candidate ID");
        int id = sc.nextInt();

        if (candidates.containsKey(id)) {
            System.out.println("What company do you want to know? 1? 2? or 3?");
            int number = sc.nextInt();
            if (number == 1 || number == 2 || number == 3) {
                System.out.println(candidates.get(id).get(number-1));
            } else {
                System.out.println("We have only 3 company listed!");
            }

        } else {
            System.out.println("We do not have this candidate in the system");
        }
    }
}
