import java.time.LocalDate;  //this is for testing purposes, do not use

public class APCalendar
{
    /** Returns true if year is a leap year and false otherwise. */
    private static boolean isLeapYear(int year)
    { return year % 4 == 0 && year % 100 != 0 || year % 400 == 0; }

    /** Returns the number of leap years between year1 and year2, inclusive.
    * Precondition: 0 <= year1 <= year2
    */
    public static int numberOfLeapYears(int year1, int year2)
    { /* to be implemented in part (a) */ 
        int count = 0;
        for( int x = year1; x < year2+1; x++ )
        {
            if(isLeapYear(x))
            {
                count++;
            }
        }
        return count;
    }

    /** Returns the value representing the day of the week for the first day of year,
    * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
    */
    private static int firstDayOfYear(int year)
    {
        return LocalDate.of(year,1,1).getDayOfWeek().getValue() % 7;
    }

    /** Returns n, where month, day, and year specify the nth day of the year.
    * Returns 1 for January 1 (month = 1, day = 1) of any year.
    * Precondition: The date represented by month, day, year is a valid date.
    */
    private static int dayOfYear(int month, int day, int year)
    { return LocalDate.of(year,month,day).getDayOfYear(); }

    /** Returns the value representing the day of the week for the given date
    * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
    * and 6 denotes Saturday.
    * Precondition: The date represented by month, day, year is a valid date.
    */
    public static int dayOfWeek(int month, int day, int year)
    { /* to be implemented in part (b) */ 
        int start = firstDayOfYear(year);
        int days = dayOfYear(month,day,year)-1;
        return (start + days)%7;//the logic for this one
    }// 11.5 mins completion thank god omfg

    // There may be instance variables, constructors, and other methods not shown.
}



