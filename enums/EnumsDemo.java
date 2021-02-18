package enums;

import static enums.TaxMaritalStatus.*;

public class EnumsDemo {
    public static void main(String[] args) {

       // System.out.println(isWorkDay(DaysInWeek.FRIDAY));

        System.out.println(isWorkDay((DaysInWeek.FRIDAY)));

        System.out.println(MARRIED.getValue());


//        isWorkDay(DaysInWeek.valueOf("OneMoreSunday"));


    }
    //   public static boolean isWorkDay(String  day){
    //       return true;
    //   }

    public static boolean isWorkDay(DaysInWeek days) {
        switch (days) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                return true; // we do not use break bc we use return (it acts as a break itself)
            default:
                return false;
        }
    }
}
