import java.util.*;

public class StepTracker{
    pirvate int Minsteps;
    pirvate int totalSteps;
    pirvate int totalDays;
    pirvate int activeDays;

    public StepTracker()
    {
        Minsteps = 0;
        totalSteps = 0;
        totalDays = 0;
        activeDays = 0;
    }
    public StepTracker(int num){
        Minsteps = num;
        totalSteps = 0;
        totalDays = 0;
        activeDays = 0;
    }
    public void addDailyStep(int steps){
        totalSteps += steps;
        totalDays++;
        if(Steps >= Minsteps){
            activeDays++;
        }
    }
    public int activeDays(){
        return activeDays;
    }
    public double averageSteps(){
        if(totalDays == 0){
            return 0.0;
        }
        else return (double) (totalSteps / totalDays);
    }
}