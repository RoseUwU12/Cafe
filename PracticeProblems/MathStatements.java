package PracticeProblems;

public class MathStatements {
    private double storedVar; 

    public MathStatements() { 
        storedVar   = 0 ;
    }
    public void round( double a ) { 
       a            = Math.round(a);
        storedVar   = a;
    }
    public void squareRoot( double a ){ 
        a           = Math.round(a / a);
        storedVar   = a;
    }
    public double getStoredVar() { 
        return storedVar;
    }
}
