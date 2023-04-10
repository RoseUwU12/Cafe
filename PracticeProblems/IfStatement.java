package PracticeProblems;

public class IfStatement {
    StoreVar SV = new StoreVar();
    private boolean StoredStatement; 

 public IfStatement(){ 
    StoredStatement = false; 
    }

    public void IsLessThen( int x ,  int y ) { 
        if ( x < y ){ 
            StoredStatement = true; 
        }
        else { 
            StoredStatement = false; 
        }
    }


    public void IsGreaterThen( int a , int b ) { 
        if (a > b) { 
            StoredStatement = true; 
        }
        else { 
            StoredStatement = false;
        }
    }


    public void IsGreaterOrEqual( int c , int d) { 
        if (c >= d) { 
            StoredStatement = true; 
        }
        else { 
            StoredStatement = false; 
        }
    }
    
    
    public void IsLessOrEqual( int e , int f ) { 
        if ( e <= f) { 
            StoredStatement = true; 
        }
        else { 
            StoredStatement = false;
        }
    }
    
    
    public void IsEqual ( int g , int h) { 
        if (g == h){
            StoredStatement = true; 
        }
        else { 
            StoredStatement = false; 
        }
    }
    
    public void divEqualZero ( double i , double j) { 
        if ( i / j == 0  && i != 0 && j != 0) { 
            StoredStatement = true; 
        }
        else {
            StoredStatement = false;
        }
    }
    public void MulEqual( double i , double j , double k ) { 
        if ( i * j == k ) { 
            StoredStatement = true; 
        }
        else {
            StoredStatement = false;
        }
    }
    public void MulLess( double i , double j , double k ) { 
        if ( i * j < k ) { 
            StoredStatement = true; 
        }
        else {
            StoredStatement = false;
        }
    }
    public void MulGreater( double i , double j , double k ) { 
        if ( i * j > k ) { 
            StoredStatement = true; 
        }
        else {
            StoredStatement = false;
        }
    }
    public void MulGreaterEqual( double i , double j , double k ) { 
        if ( i * j >= k ) { 
            StoredStatement = true; 
        }
        else {
            StoredStatement = false;
        }
    }
    public void MulLessEqual( double i , double j , double k ) { 
        if ( i * j <= k ) { 
            StoredStatement = true; 
        }
        else {
            StoredStatement = false;
        }
    }

    public boolean GetStoredStatement() { 
        return StoredStatement;
    }
}
