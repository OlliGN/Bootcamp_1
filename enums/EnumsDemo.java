package enums;

import static enums.TaxMaritalStatus.*;

public class EnumsDemo {
    public static void main(String[] args) {

        System.out.println(isWorkDay((DaysInWeek.FRIDAY)));

        System.out.println(MARRIED.getValue());

        calculateTax(120_000, TaxMaritalStatus.MARRIED);

        System.out.println(MARRIED.getValue());

    }

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

    public static double calculateTax(double annualIncome, TaxMaritalStatus maritalStatus) {
        if (maritalStatus.equals(MARRIED) && annualIncome < 60_000) {
            return annualIncome * 0.10;
        } else if (maritalStatus.equals(SINGLE) && annualIncome < 100_000) {
            return annualIncome * 0.30;
        }
        return 0;
    }
}
