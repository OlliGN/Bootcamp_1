package Arrays;

public class multidimensionalArrays {
    public static void main(String[] args){
        double[] mondaySales = {12.43, 65.4, 56.5, 54.33};
        double[] tuesdaySales = {142.43, 65.4, 56.5, 54.33};
        double[] wednesdaySales = {12.43, 65.4, 536.5, 4.33};
        double[] thursdaySales = {122.43, 655.4, 566.5, 56.33};

        double [] [] weeklySales = new double[7][4];
        weeklySales[0] = mondaySales;
        weeklySales[1] = tuesdaySales;
        weeklySales[2] = wednesdaySales;
        weeklySales[3] = thursdaySales;
       // System.out.println(Arrays.deepToString(weeklySales));

        System.out.print(weeklySales[1][2]);
         //HW
        // Print the sum of all sales
    }
}
