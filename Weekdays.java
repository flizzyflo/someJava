package someJava;

// 4.1.2009

public class Weekdays {

    public static void main(String[] args)
    {
        berechneWochentag(4,1,2009);
    }

    public static void berechneWochentag(int day, int month, int year)
    {
        int weekdayValue = rechneWochentag(day, month, year);
       
        switch(weekdayValue)
        {

            case 0:
            System.out.println("Sunday");
            break;

            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thursday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;
        }
    }

    public static int rechneWochentag(int day, int month, int year){

        if (month == 1)
        {
            year --;
            month = 13;
        };

        if (month == 2)
        {
            year --;
            month = 14;
        };
        
        String tempVariableYear = Integer.toString(year).substring(2, 4);
        String tempVariableCentury = Integer.toString(year).substring(0, 2);
        int yearVariable = Integer.parseInt(tempVariableYear);
        int century = Integer.parseInt(tempVariableCentury);

        return (day + (26 * (month + 1))/10 + (5 * yearVariable)/4 + century/4 + 5 * century - 1) % 7;

    }

}
