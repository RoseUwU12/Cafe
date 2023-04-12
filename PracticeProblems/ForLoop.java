package PracticeProblems;
//! Method to use nstead of a for loop
public class ForLoop {
    private int storedValue;
 public ForLoop() { 
    storedValue = 0; 
 }
 public void CallForLoop( int x , int y, int z ) { 
    for ( int k = x ; k<= y ; k ++ ) { 
        storedValue = z;
        
    }
 }
 public void CallAddLoop( int x , int y , int z , int v) { 
    for ( int k = x ; k <=y ; k++ ) { 
        z  = z + v;
        storedValue = z; 
    }
 }

 public void CallSubLoop( int x , int y , int z , int v) { 
    for ( int k = x ; k <=y ; k++ ) { 
        z  = z - v;
        storedValue = z; 
    }
 }
 public void CallDivLoop( int x , int y , int z , int v) { 
    for ( int k = x ; k <=y ; k++ ) { 
        z = z / v;
        storedValue = z; 
    }
 }
 public void CallMulLoop( int x , int y , int z , int v) { 
    for ( int k = x ; k <=y ; k++ ) { 
        z = z * v;
        storedValue = z; 
    }
 }
 public void CallExpLoop( int x , int y , int z ) { 
   for ( int k = x ; k <= y ; k++ ){ 
      z = z*z ; 
      storedValue = z;
   }
 }
 public void CallLogicLoop( int x , int y , int z , int s , int l) { 
   for ( int k = x ; k<=y ; k++) { 
      if ( k % s == 0) { 
         z = z * s; 
         storedValue = z ;
      }
      else if ( k % l == 0) {
         z = z * l;
         storedValue = z;
      }
   }
 }
 public void Reset() { 
    storedValue = 0; 
 }



 public double returnStoredValue(){ 
    return storedValue; 
 } 
}
