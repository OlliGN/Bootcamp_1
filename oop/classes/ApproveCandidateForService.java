package oop.classes;

public class ApproveCandidateForService {
    public static void main(String[] args){
        Candidate c1 = new Candidate();
        c1.name = "John Doe";
        c1.yearsOfExp = 10;
        c1.hasEAD= false;

        System.out.println(isApproved(c1));

        Candidate c2 = new Candidate();
        c2.name = "Elon Musk";
        c2.yearsOfExp = 12;
        c2.hasEAD= true;

        System.out.println(isApproved(c2));
    }

    public static boolean isApproved (Candidate candidate){
        return candidate.yearsOfExp > 6 && candidate.hasEAD;
    }
}
