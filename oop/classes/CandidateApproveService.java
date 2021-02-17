package oop.classes;

import oop.classes.Candidate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CandidateApproveService {
    public static void main(String[] args) {
        Candidate c1 = new Candidate();
        c1.name = "John Doe";
        c1.yearsOfExp = 10;
        c1.hasEAD = true;
        c1.candidateSkills = new HashSet<>();
        c1.candidateSkills.add("Unix");
        c1.candidateSkills.add("Java");
        c1.candidateSkills.add("Junit");
        c1.phoneNumber = "321 -343 -4567";
        c1.email = "doe@gmail.com";
        System.out.println(isApproved((c1)));

        Candidate c2 = new Candidate();
        c2.name = "Elon";
        c2.yearsOfExp = 15;
        c2.hasEAD = true;
        c2.candidateSkills = new HashSet<>();
        c2.candidateSkills.add("HTML");
        c2.candidateSkills.add("Java");
        c2.candidateSkills.add("Linux");
        c2.phoneNumber = "341 -000-4567";
        c2.email = "elon@gmail.com";
        System.out.println(isApproved((c2)));

        Candidate c3 = new Candidate();
        c3.name = "Steve";
        c3.yearsOfExp = 1;
        c3.hasEAD = true;
        c3.candidateSkills = new HashSet<>();
        c3.candidateSkills.add("HTML");
        c3.candidateSkills.add("CSS");
        c3.candidateSkills.add("Ubuntu");
        c3.phoneNumber = "901 -343 -3167";
        c3.email = "steve@gmail.com";
        System.out.println(isApproved((c3)));

        // providing characteristics are optional if an instance variable(characteristic) are not initialized

        List<Candidate> allCandidates = new ArrayList<>();
        allCandidates.add(c1);
        allCandidates.add(c2);
        allCandidates.add(c3);

        printApproved(allCandidates);
    }

    public static boolean isApproved(Candidate candidate) {
        Set<String> reqSkills = new HashSet<>();
        reqSkills.add("Java");
        reqSkills.add("Unix");
        reqSkills.add("Junit");

        return (candidate.yearsOfExp > 6 && candidate.hasEAD && candidate.candidateSkills.containsAll(reqSkills));
    }
    //write a method which takes list of candidates and prints out name, phone# and email of approved candidates

    public static void printApproved(List<Candidate> allCandidates) {
        for (Candidate candidate : allCandidates) {
            if (isApproved(candidate)) {
                System.out.println(candidate.name);
                System.out.println(candidate.phoneNumber);
                System.out.println(candidate.email);
            }
        }
    }
}
