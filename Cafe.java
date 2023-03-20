
public class Cafe {
  // Employee class is "imported" here as em.Methodname()
  Employee Em = new Employee();
  //Variables are set as private so we can use a constructor 
  private double TotalMoneyNT;
  private int totalSales;
  private int TotalCustomers;
  private int FoodItemSold;
  private double coffee;
  private double biscut;
  private double brownie;
  private double cookie;
  private int ordernumber;
  private double orderTotal;
  private int days;
  private boolean Satisfaction;
  private int time;
  private int sec;
  private int min;
  private int hours;
  private int day;
  private int totalOrders;
  private int SatCus;
  private double SatCusPer;
  private int dayCounter;
  private double archMoney;
  private int archSales; 
  private int archCustomers;
  private int weeks; 
  private int archTotOrders;
  private double tax;
  private double MoneyT;
  private boolean colinIsGay;
  
  public Cafe (){
    //this is the constructor it will set the variables when we call it in another class
    TotalMoneyNT = 0;
    totalSales = 0;
    TotalCustomers = 0;
    FoodItemSold = 0;
    ordernumber = 0;
    orderTotal = 0;
    days = 0;
    time = 0;
    totalOrders = 0;
    SatCus = 0;
    SatCusPer = 0.0;
    dayCounter = days;
    weeks = 0;
    tax = 0.07;
    colinIsGay = true;
    sec = 0;
    min = 0;
    hours = 0;
  }
  public double foodPackage (final double c, final double b, final double r, final double l){
    //simple method constuctor, takes 4 integers and sets them as 4 private integers. This shows how we can track info across files and classes
    coffee = c;
    biscut = b;
    brownie = r;
    cookie = l;
    // returns the values of the intergers 
    return (c * 2) + (b * 1.5) + (r * 1.75) + (l * 2.25);
  }
public void Order( final double a , final double b , final double c , final double d){
  //method to be called in other classes and will use a, b , c , and d as variables
    if (days == dayCounter ){ //if the day variable is equal to the day counter then the code will run 
      FoodItemSold = 0;
      FoodItemSold += a + b + c + d;
      TotalCustomers ++ ;
      TotalMoneyNT += Math.round(foodPackage(a , b , c , d) * tax);
      ordernumber ++;
      orderTotal = 0;
      orderTotal = foodPackage( a, b , c , d);
      MoneyT += Math.round(orderTotal * tax);
      Satisfaction = SatisfactionFormula();
    if (Satisfaction == true) {
      SatCus++;
    }
      time = TimeFormula();
      totalSales += FoodItemSold;
      totalOrders ++;
    if ( ordernumber % 4 == 0){
      days++;
    }
      SatCusPer = CustomerFormula();
          archSales += FoodItemSold;
          archMoney += TotalMoneyNT ; 
          archCustomers += TotalCustomers; 
          archTotOrders ++;
    if (sec == 60) {
      min++;
      sec = sec - 60;
    }
    else if (sec > 60){
      min = sec / 60;
      sec = sec - 60;
    }

    if ( min == 60 ) {
     hours++;
     min = 0;
    }
    else if ( min > 60){
     hours = min / 60;
     min = min - (hours * 60);
    }
    
  }
  else { //will run if the days arent equal to day counter
    archSales += FoodItemSold;
          archMoney += TotalMoneyNT; 
          archCustomers += TotalCustomers; 
          archTotOrders ++;
      dayCounter = days;
      time = 0;
      totalOrders = 0;
      SatCus = 0;
      SatCusPer = 0.0;
      TotalMoneyNT = 0;
      totalSales = 0;
      TotalCustomers = 0;
      FoodItemSold = 0;
      ordernumber = 0;
      orderTotal = 0;
      FoodItemSold = 0;
      FoodItemSold += a + b + c + d;
      TotalCustomers ++ ;
      TotalMoneyNT += Math.round(foodPackage(a , b , c , d) * tax);
      ordernumber ++;
      orderTotal = 0;
      orderTotal = foodPackage( a, b , c , d);
      MoneyT = Math.round(orderTotal * tax);
      Satisfaction = SatisfactionFormula();
    if (Satisfaction == true) {
      SatCus++;
    }
     time = TimeFormula();
      totalSales += FoodItemSold;
      totalOrders ++;
     if ( ordernumber % 4 == 0){
        days++;
    }
      if ( days % 7 == 0){
      weeks++;
    }
      SatCusPer = CustomerFormula();
    sec = time;
      if (sec == 60) {
      min++;
      sec = 0;
    }
    else if (sec > 60){
      min = sec / 60;
      sec = sec - (min /  60);
    }

    if ( min == 60 ) {
     hours++;
     min = 0;
    }
    else if ( min > 60){
     hours = min / 60;
     min = min - (hours * 60);
    }
    
  }
}

  
  public  boolean SatisfactionFormula() {
    if ( time <= 10) {
      return true;
    }
    else {
      return false;
    }
  }
    public int TimeFormula(){
    return FoodItemSold * 2;
    }
// all of these are for getting variable data in other classes. They are one line methods
  public double CustomerFormula(){
    return Math.round(SatCus / TotalCustomers * 10);
  }
  public double getMoney(){
    return TotalMoneyNT;
  }
  public int getOrderNum(){
    return ordernumber;
  }
  public double getCustomers(){
    return TotalCustomers;
  }
  public int getFood(){
    return FoodItemSold;
  }
  public double getOrderTotal(){
    return orderTotal;
  }
  public double getCoffee(){
    return coffee;
  }
   public double getCookie(){
    return cookie;
  }
   public double getBrownie(){
    return brownie;
  }
   public double getBiscut(){
    return biscut ;
  }
   public double getCoffeeA(){
    return coffee * 2;
  }
   public double getCookieA(){
    return cookie * 2.25;
  }
   public double getBrownieA(){
    return brownie * 1.75;
  }
   public double getBiscutA(){
    return biscut * 1.5;
  }
  public int getDays(){
    return days; 
  }
  public boolean getSatisfaction(){
    return Satisfaction;
  }
  public int getTime(){
    return time;
  } 
  public int getTotalSales(){
    return totalSales;
  }
  public int getTotalOrders(){
    return totalOrders;
  }
  public double getSatCus(){
    return SatCus;
  }
  public double GetSatCusPer(){
    return SatCusPer;
  }
  public double GetArchMoney(){
    return archMoney;
  }
  public int getArchSales(){
    return archSales;
  }
  public int getArchCustomers(){
    return archCustomers;
  }
  public int getWeeks(){
    return weeks;
  }
  public int getArchTotOrders(){
    return archTotOrders;
  }
  public double getMoneyT(){
    return MoneyT;
  }
  public boolean Colin(){
    return colinIsGay;
  }
  public int Seconds(){
    return sec;
  }
  public int Minutes(){
    return min;
  }
  public int Ghours(){
    return hours;
  }
  
}


//public void Order( final double a , final double b , final double c , final double d){
// if (days = dayCounter ){ 
  //  FoodItemSold = 0;
    //FoodItemSold += a + b + c + d;
    //TotalCustomers ++ ;
    //TotalMoney += foodPackage(a , b , c , d);
    //ordernumber ++;
    //orderTotal = 0;
    //orderTotal = foodPackage( a, b , c , d);
    //Satisfaction = SatisfactionFormula();
  //if (Satisfaction == true) {
    //SatCus++;
  //}
   // time = TimeFormula();
    //totalSales += FoodItemSold;
    //totalOrders ++;
  // if ( ordernumber % 4 == 0){
    //  days++;
    //  dayCounter = days;
    //}
    //SatCusPer = CustomerFormula();
  //}
    // else {
      // time = 0;
      // totalOrders = 0;
      // SatCus = 0;
      // SatCusPer = 0.0;
      //TotalMoney = 0;
      //totalSales = 0;
      //TotalCustomers = 0;
      //FoodItemSold = 0;
      //ordernumber = 0;
      //orderTotal = 0;
      //  FoodItemSold = 0;
      //FoodItemSold += a + b + c + d;
      //TotalCustomers ++ ;
      //TotalMoney += foodPackage(a , b , c , d);
      //ordernumber ++;
      //orderTotal = 0;
      //orderTotal = foodPackage( a, b , c , d);
      //Satisfaction = SatisfactionFormula();
    //if (Satisfaction == true) {
      //SatCus++;
    //}
      // time = TimeFormula();
      //totalSales += FoodItemSold;
      //totalOrders ++;
    // if ( ordernumber % 4 == 0){
      //  days++;
      //  dayCounter = days;
    //}
      //SatCusPer = CustomerFormula();
 // }
//}

  
