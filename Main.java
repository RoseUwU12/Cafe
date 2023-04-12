import PracticeProblems.StoreVar;
/******************************************************
 * SIMPLE CLASS CALLING / METHOD PRACTICE. IN JAVA;   *
 ******************************************************/
class Main{
  public static void main(final String[] args) {
  final Steptracker tr = new Steptracker(10000);
  final Cafe cf = new Cafe();
  Stock STK = new Stock();
  Print Pr = new Print();
  employee Em = new employee(); 
  Shipment Sm = new Shipment();
  StoreVar Sv = new StoreVar();

    Sm.Test( 36 ,34 , 0);
  System.out.println(Sm.getTestStatement());
  System.out.println(tr.activeDays());
  System.out.println(tr.averageSteps());
  tr.addDailySteps(9000); 
  tr.addDailySteps(5000);  
  System.out.println(tr.activeDays());
  System.out.println(tr.averageSteps());
  tr.addDailySteps(13000);
  System.out.println(tr.activeDays());
  System.out.println(tr.averageSteps());
  tr.addDailySteps(23000);
  tr.addDailySteps(1111); 
  System.out.println(tr.activeDays()); 
  System.out.println(tr.averageSteps());   
    System.out.println("uwu");
    cf.Order(3, 6 ,5 ,4 );
    Sv.StoreDoubleVar(cf.getMoneyT());
    System.out.println(Sv.GetSD());
    
  for ( int P = Pr.GetPrintInt() ; P<= Pr.GetPrintUntil() ; P++){
    cf.Order(1 , 2  , 3 , 4);
    System.out.println("                           ");
    System.out.println("----------"); 
     System.out.println("         Order #" + cf.getOrderNum());
      System.out.println( "Food items purchased    "  + cf.getFood());
    System.out.println( "   Coffee    " + cf.getCoffee());
    System.out.println( "   Brownie   " + cf.getBrownie());
    System.out.println( "   Biscut    " + cf.getBiscut());
    System.out.println( "   Cookie    " + cf.getCookie());
         System.out.println("$$$ amount of each item");
    System.out.println( "   Coffee     " + cf.getCoffeeA() + "$");
    System.out.println( "   Brownie    " + cf.getBrownieA() + "$");
    System.out.println( "   Biscut     " + cf.getBiscutA() + "$");
    System.out.println( "   Cookie     " + cf.getCookieA() + "$");
      System.out.println("Order Total  " + cf.getOrderTotal() + "$");
      System.out.println("Tax amount    " + cf.getMoneyT());
 System.out.println("Customer Satisfaction " + cf.getSatisfaction());
       System.out.println("Time to complete Order    " + cf.getTime() + ":00");
        System.out.println("Can make order ?");
 if (cf.getCoffee() <= STK.getStkCoffee() && cf.getCookie() <= STK.getStkCookie() && cf.getBrownie() <= STK.getStkBrownie() && cf.getBiscut() <= STK.getStkBiscut() ) {
    System.out.println("yes");
  }
else {
System.out.println("No");
}
    if (cf.getOrderNum() % 4 == 0){
  System.out.println("                           ");
    System.out.println("-----------------------------");
    System.out.println("        Daily Stats         ");
    System.out.println("          Day #" + cf.getDays());
    System.out.println("Amount of Orders      " + cf.getTotalOrders());
    System.out.println("Total Sales      " + cf.getTotalSales());
    System.out.println("Total Amount of $ made    " + cf.getMoney() + "$");
    System.out.println("Satisfied Customers " + cf.getSatCus());
    System.out.println("                 -------");
    System.out.println("Total Customers     " + cf.getCustomers());
    System.out.println("Customer Satisfaction %  " + Math.round(cf.getSatCus() / cf.getCustomers() * 100) + "%");
    System.out.println("                     ");
    }
  if ((cf.getDays() % 7 == 0 && cf.getWeeks() == 1) || (cf.getDays() == 7 && cf.getOrderNum() % 4 == 0 )  ){
    System.out.println("           Total Stats");
System.out.println( "        week #" + cf.getWeeks() +"  " + "day #" + cf.getDays());
System.out.println( "Total Money Made" + "   " + cf.GetArchMoney() + "$");
System.out.println( "Total Customers" + "   " +  cf.getArchCustomers());
System.out.println( "Total Sales" + "   " + cf.getArchTotOrders());
    if (cf.getArchTotOrders() >= 70 || cf.getArchCustomers() >= 5 || cf.GetArchMoney() >= 500 ) {
      System.out.println("     You did really good this week ");
    }
    else if (cf.getArchTotOrders() >= 50 || cf.getArchCustomers() >= 3 || cf.GetArchMoney() >= 400 ) {
      System.out.println(" You did pretty good this week ");
    }
    else {
      System.out.println(" You didn't reach any goals this week ;(");
    }
  }

  }
  }
}
