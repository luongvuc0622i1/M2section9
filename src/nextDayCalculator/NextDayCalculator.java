package nextDayCalculator;

public class NextDayCalculator {

    public static final String SLASH = "/";
    public static final int THELASTMONTH = 12;

    public static String getNextDay(int day, int month, int year) {
        int theLastDayOfMonth;
        theLastDayOfMonth = getTheLastDayOfMonth(month, year);
        if (month == THELASTMONTH) {
            day = 1;
            month = 1;
            year++;
        } else if (day == theLastDayOfMonth) {
            day = 1;
            month++;
        } else {
            day++;
        }
        return day + SLASH + month + SLASH + year;
    }

    private static int getTheLastDayOfMonth(int month, int year) {
        int theLastDayOfMonth;
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
                boolean isLeapYear = false;
                isLeapYear = isLeapYear(year);
                if(isLeapYear)
                    theLastDayOfMonth = 29;
                else
                    theLastDayOfMonth = 28;

        }
        return theLastDayOfMonth;
    }

    private static boolean isLeapYear(int year) {
        boolean isLeapYear;
        if(year % 4 == 0) {
            if( year % 100 == 0) {
                if ( year % 400 == 0)//chia hết cho 400 là năm nhuận
                    isLeapYear = true;
                else
                    isLeapYear = false;//không chia hết cho 400 thì không phải năm nhuận
            }
            else
                isLeapYear = true;
        }
        else
            isLeapYear = false;
        return isLeapYear;
    }
}
