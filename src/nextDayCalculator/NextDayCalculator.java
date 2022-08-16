package nextDayCalculator;

public class NextDayCalculator {

    public static final String SLACH = "/";

    public static String getNextDay(int day, int month, int year) {
        return ++day + SLACH + month + SLACH + year;
    }
}
