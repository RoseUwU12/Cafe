package OnlineServerStuff.AdminStuff; 

public class Reporting { 
    private int reportAmount;
    private int reportSubNum;
    private boolean report;
    private boolean submit;  
    private String Reason; 
    private String length; 
    private String category;

    public Reporting() { 
      reportAmount = 0; 
      report = false; 
      submit = false;   
      reportSubNum = 0;
    }
    public void report() { 
        reportAmount += 1; 
        report = true; 
        reportSubNum += 1 ;
    }
    public void submitReport(String reason , String Length , String Category){ 
        Reason = reason; 
        length = Length; 
        category = Category;
        submit = true; 
    }
    public int getReportAmount(){ 
      return reportAmount;
    }
    public String getReason() { 
      return Reason;
    }
    public String getLength(){
      return length;
    }
    public String getCategory() { 
      return category;
    }
    public int getReportSubNum(){ 
      return reportSubNum;
    }
}