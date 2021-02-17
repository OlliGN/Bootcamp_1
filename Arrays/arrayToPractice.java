package Arrays;

import java.util.Arrays;

public class arrayToPractice {
    public static void main(String[] args){
        String[] friends = {"Marina", "Ross", "Anton", "Oksana", "Anfisa"};
        for( int i = 0; i < friends.length; i++){
          //  System.out.println(friends[i]);
        }
        String[][] RR_Logistics = new String[2][];
        RR_Logistics[0] = new String[]{"Safety", "Accaunting", "Dispatch"};
        RR_Logistics[1] = new String[]{"Drivers", "Mechanics"};
        //System.out.println(Arrays.deepToString(RR_Logistics));

        for(int i = 0; i < RR_Logistics.length; i++){
            for(int j = 0; j < RR_Logistics[i].length; j++){
               // System.out.println(Arrays.deepToString(RR_Logistics[j]));
            }
        }
        //delete an element from the Array
        for(int i = 0; i < RR_Logistics.length; i++){
            for(int j = 0; j < RR_Logistics[i].length; j++){
                if(RR_Logistics[i][j].equals("Accaunting")){
                    RR_Logistics[i][j] = "";
                    System.out.println(Arrays.deepToString(RR_Logistics));
                }
            }
        }

    }
}
