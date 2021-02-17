package Arrays;

public class array1 {
    public static void main(String args[]){
        System.out.println();
        int[] studentsAges = new int [10];
        studentsAges[0] = 20;
        studentsAges[1] = 31;
        studentsAges[2] = 44;
        studentsAges[3] = 19;
        studentsAges[4] = 50;
        studentsAges[5] = 38;
        studentsAges[6] = 35;
        studentsAges[7] = 18;
        studentsAges[8] = 22;
        studentsAges[9] = 31;

        int sum = 0;
        int counter = 0;
        for (int i = 0; i < 10; i++){
            sum += studentsAges[i];
            System.out.println(sum/10);

            //White, Latino, Asian, Black
            String[] studentRaces = new String[10];


            studentRaces[0] = "Asian";
            studentRaces[1] = "White";
            studentRaces[2] = "Black";
            studentRaces[3] = "Latino";
            studentRaces[4] = "Latino";
            studentRaces[5] = "Latino";
            studentRaces[6] = "Black";
            studentRaces[7] = "White";
            studentRaces[8] = "Asian";
            studentRaces[9] = "White";
            //how many latinos do we have?
            int q = 0;
            for (q =0; q < 10; q++ ){
                if (studentRaces[q].equals("Latino")){
                    System.out.println(studentRaces[i]);
                }

            }




        }

    }
}
