package CodingBat.StringsWarnup;

public class caughtSpeeding {
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(85,true));

    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if ((!isBirthday && speed <= 60) || (isBirthday && speed <= 65)) {
            return 0;
        } else if ((!isBirthday && speed > 60 && speed <= 80) || (isBirthday && speed > 60 && speed <= 85)){
            return 1;
        }else if((!isBirthday && speed >= 81) || (isBirthday && speed >= 86 && speed < 100)){
            return 2;
        }
        return 2;
    }
}
