 public class Employee {
  private double Paycheck;
  private double Totalpay;
  private double CafeMoney;
  private int TotEmployee;


public Employee(){
  Paycheck = 10.0;
  TotEmployee = 3;
}
public double getMoneyOwed(){
  return TotEmployee * Paycheck;
}
 }
