package PracticeProblems;

public class WhileLoop {
    private int StoredNumber;

    public WhileLoop(){ 
        StoredNumber = 0 ;
    }

    public void callGTWhileLoop( int x , int y , int z ) { 
        while (x > y) { 
            z ++ ;
            StoredNumber = z ;
        }
    }
    public void callLTWhileLoop( int x , int y , int z) { 
        while ( x < y) {
            z ++ ; 
            StoredNumber = z ;
        }
    }
    public void callLEWhileLoop(int x , int y , int z) { 
        while ( x <= y) { 
            z++; 
            StoredNumber = 0; 
        }
    }
    public void callGEWhileLoop(int x , int y , int z) { 
        while ( x >= y ) { 
            z++; 
            StoredNumber = z ; 
        }
    }
    public void reset() { 
        StoredNumber = 0; 
    }
}
