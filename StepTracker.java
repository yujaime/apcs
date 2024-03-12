public class StepTracker {
    /*
     * 
     * make sure to read all the necessary methods before starting, dont forget casting doubles due to integer division.
     * 
     */
    // private int dailySteps;
    private int activeDays;
    private int minimum;
    private int total;
    private int allDays;

    public StepTracker(int steps)
    {
        // dailySteps = 0;
        activeDays = 0;
        minimum = steps;
        total = 0;
        allDays = 0;
    }

    public void addDailySteps(int steps)
    {
        total += steps;
        allDays++;
        if( steps > minimum )
        {
            activeDays++;
        }
    }

    public int activeDays()
    {
        return activeDays;
    }

    public double averageSteps()
    {
        if( allDays == 0 )
        {
            return 0;
        }
        return (double)total/allDays;
    }

}
