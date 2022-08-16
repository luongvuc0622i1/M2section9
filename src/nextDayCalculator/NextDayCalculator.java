package nextDayCalculator;

public class NextDayCalculator {

    public static final String SLASH = "/";

    public static String getNextDay(int day, int month, int year) {
        int theLastDayOfMonth = 31;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                theLastDayOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                theLastDayOfMonth = 30;
                break;
            default:
                theLastDayOfMonth = 28;
        }
        if (day == theLastDayOfMonth) {
            day = 1;
            month++;
        } else {
            day++;
        }
        return day + SLASH + month + SLASH + year;
    }
}
