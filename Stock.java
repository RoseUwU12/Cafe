public class Stock {
  //Creates integers 
  Cafe cf = new Cafe(); 
  private int stkBuiscut;
  private int stkCookie;
  private int stkBrownie;
  private int stkCoffee;
  private int CafeOrderNum; 
  private int CafeDay;
//creates a constructor 
  public Stock() {
  stkBuiscut = 1000;
  stkCookie = 1000;
  stkBrownie = 1000;
  stkCoffee = 1000;
  CafeOrderNum = cf.getOrderNum();
  CafeDay = cf.getDays();
  }
  public int Getstock(int O){
    if (cf.getOrderNum() > CafeOrderNum){
    stkBuiscut += O ;
    stkCookie +=  O ; 
    stkBrownie += O; 
    stkCoffee +=  O; 
      return  1;
      }
    else if (cf.getDays() > CafeDay){
      stkBuiscut += (O * 2);
      stkCookie += (O * 2);
      stkBrownie += (O * 2);
      stkCoffee += (O * 2);
      return 1;
    }
    else {
      return 0;
    }
  }
 
  

  
  
  
  //Methods for calling in other classes 
  public int getStkBiscut(){
    return stkBuiscut;
  }
  public int getStkCookie(){
    return stkCookie;
  }
  public int getStkBrownie(){
    return stkBrownie;
  }
  public int getStkCoffee(){
    return stkCoffee;
  }
}

