package OnlineServerStuff.AdminStuff;

public class ReportingDatabase {
    Reporting Re = new Reporting();
    private int statsReportAmount; 
    private int statsReportSubNum; 
    private String statsReason; 

    public ReportingDatabase() { 
        Re.report(); 
        Re.submitReport("AutoClicker", "one year","Hackikng" );

    }

    public ReportingDatabase() {
}
}
