public class StepTracker {
  private int activeDays;
  private int totalDays;
  private int totalSteps;
  private int goal;
  private StepTracker tr;

  public StepTracker(int g){
    goal = g; 
    totalSteps = 0;
    totalDays = 0;
    activeDays = 0;
  }
  public void addDailySteps ( int a ){
    totalSteps += a;
    totalDays ++;
   if ( a >= goal ) {
     activeDays++;
   }
  }
  public int activeDays () {
    return activeDays;
  }
  public double  averageSteps(){
    if (totalDays == 0){
      return 0.0;
    }
    else {
    return totalSteps / totalDays;
    }
  }
  
  
}
//days with 10,000 steps are considered positive 
// If ( DailySteps == 10,000)

//addDailySteps Method
//adds steps per a day 

//activeDays Method 
// returns the amount of active days and not the amount of active days 

// AverageSteps Method 
// returns the Average number of steps per day (total number of steps / the number of days tracked)
// needs to know the 

// Step counter class 
// Needs to track the total amount of steps and the amount of days

// Active days 
// The class needs to track the total amount of active days ( Active day = 10,000 steps ot more)

// 
