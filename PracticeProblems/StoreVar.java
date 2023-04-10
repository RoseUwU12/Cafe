package PracticeProblems;

public class StoreVar {
    private int StoredInt; 
    private Boolean StoredBoolean; 
    private double StoredDouble; 

    public StoreVar() { 
        StoredInt = 0; 
        StoredBoolean = false; 
        StoredDouble = 0.0; 
    }

    public void StoreIntVar( int x) { 
       StoredInt = x;  
    }
    public void StoreBooleanVar(boolean x) { 
        StoredBoolean = x; 
    }
    public void StoreDoubleVar( double x) { 
        StoredDouble = x; 
    }

    public int GetSI() { 
        return StoredInt;
    }
    public boolean GetSB() { 
        return StoredBoolean; 
    }
    public double GetSD() { 
        return StoredDouble;
    }
}
