package fizzBuzz;

public class FizzBuzzTranslate {
    private String tens;
    private String units;

    public int getTens(int number) {
        return (number%10);
    }

    public int getUnits(int number) {
        return ((number-(number%10))/10);
    }

    public String getResult(int number) {
        if(isDivisibleBy(3, number) && isDivisibleBy(5, number)){
            units = "FizzBuzz";
        }else if(isDivisibleBy(5, number) || getUnits(number) == 5 || getTens(number) == 5){
            units = "Buzz";
        }else if(isDivisibleBy(3, number) || getUnits(number) == 3 || getTens(number) == 3){
            units = "Fizz";
        }else if(number < 10){
            units = getUnitsString(number);
        }else
            units = (getTensString(number) + "-" + getUnitsString(number));
        return units;
    }

    private static boolean isDivisibleBy(int divnumber, int number) {
        return number % divnumber == 0;
    }

    private String getUnitsString(int number) {
        switch (number%10) {
            case 1:
                units = "Một";
                break;
            case 2:
                units = "Hai";
                break;
            case 3:
                units = "Ba";
                break;
            case 4:
                units = "Bốn";
                break;
            case 5:
                units = "Năm";
                break;
            case 6:
                units = "Sáu";
                break;
            case 7:
                units = "Bảy";
                break;
            case 8:
                units = "Tám";
                break;
            case 9:
                units = "Chín";
                break;
            default:
                units = "Không";
        }
        return units;
    }

    private String getTensString(int number) {
        switch ((number-(number%10))/10) {
            case 1:
                tens = "Một";
                break;
            case 2:
                tens = "Hai";
                break;
            case 3:
                tens = "Ba";
                break;
            case 4:
                tens = "Bốn";
                break;
            case 5:
                tens = "Năm";
                break;
            case 6:
                tens = "Sáu";
                break;
            case 7:
                tens = "Bảy";
                break;
            case 8:
                tens = "Tám";
                break;
            case 9:
                tens = "Chín";
                break;
            default:
                tens = "Không";
        }
        return tens;
    }
}