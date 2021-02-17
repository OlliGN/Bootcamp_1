package oop.classes;

import java.util.HashSet;
import java.util.Set;

public class Problem {
    public static void main(String[] args) {
        //Create the app that filters candidates for a job
        //returns true if candidate has 6 years of experience and
        //knows java, Unix, Junit and has work Authorization

        Set<String> candidateSkills = new HashSet<>();
        candidateSkills.add("Java");
        candidateSkills.add("Unix");
        candidateSkills.add("Junit");
        candidateSkills.add("HTML");
        candidateSkills.add("CSS");
        boolean hasEAD = true;
        int yearsOfExp = 9;
        System.out.println(isApproved(yearsOfExp, candidateSkills, hasEAD));

    }

    public static boolean isApproved(int yearsOfExp, Set<String> candidateSkills, boolean hasEAD) {
        Set<String> requireSkills = new HashSet<>();
        requireSkills.add("Java");
        requireSkills.add("Unix");
        requireSkills.add("Junit");

        boolean hasSkills = candidateSkills.containsAll(requireSkills);
        return (hasSkills && yearsOfExp >= 6 && hasEAD);
    }

}
