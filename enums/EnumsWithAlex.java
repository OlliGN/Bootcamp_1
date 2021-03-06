package enums;

public class EnumsWithAlex {

    //this is an example of enums inside the class
    enum Flavor{
        CHOCOLATE, VANILLA, STRAWBERRY;

        public static void getVanilla(){
            System.out.println(Flavor.VANILLA);
        }
    }

    public  static void main(String[] args){

        Flavor flav = Flavor.CHOCOLATE;
        flav.getVanilla();

        if(flav == flav.CHOCOLATE){
            System.out.println("Th's chocolate");
        }
        else if( flav == flav.VANILLA){
            System.out.println("Its is Vanilla");
        }
        else if(flav == flav.STRAWBERRY){
            System.out.println("Its a Strawberry");
        }
    }
}
