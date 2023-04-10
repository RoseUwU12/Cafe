package MovementController.Keyboard;

public class NumberKeys {
    private boolean oneKeyPressed;
    private boolean twoKeyPressed;
    private boolean threeKeyPressed;
    private boolean fourKeyPressed;
    private boolean fiveKeyPressed;
    private boolean sixKeyPressed;
    private boolean sevenKeyPressed;
    private boolean eightKeyPressed;
    private boolean nineKeyPressed;
    private boolean zeroKeyPressed;

    public NumberKeys() { 
        oneKeyPressed = false; 
        twoKeyPressed = false; 
        threeKeyPressed = false; 
        fourKeyPressed = false; 
        fiveKeyPressed = false; 
        sixKeyPressed = false; 
        sevenKeyPressed = false; 
        eightKeyPressed = false;
        nineKeyPressed = false; 
        zeroKeyPressed = false; 
    }

    public void pressKey( int x ){ 
        if ( x == 0 ) { 
            zeroKeyPressed = true; 
        }
        else if (x == 1) { 
            oneKeyPressed = true;
        }
        else if ( x == 2 ) { 
            twoKeyPressed = true; 
        }
        else if ( x == 3 ) { 
            threeKeyPressed = true; 
        }
        else if ( x == 4 ) { 
            fourKeyPressed = true;
        }
        else if ( x == 5 ) { 
            fiveKeyPressed = true;
        }
        else if ( x == 6 ) { 
            sixKeyPressed = true; 
        }
        else if ( x == 7 ) { 
            sevenKeyPressed = true; 
        }
        else if (x == 8) { 
            eightKeyPressed = true; 
        }
        else if ( x == 9) { 
            nineKeyPressed = true; 
        }
    }
     
    public void resetKeyState() { 
        oneKeyPressed = true; 
        twoKeyPressed = true;
        threeKeyPressed = true; 
        fourKeyPressed = true; 
        fiveKeyPressed = true; 
        sixKeyPressed = true; 
        sevenKeyPressed = true; 
        eightKeyPressed = true; 
        nineKeyPressed = true; 
        zeroKeyPressed = true; 
    }
    public boolean OneKeyState(){ 
        return oneKeyPressed; 
    }
    public boolean twoKeyState(){ 
        return twoKeyPressed; 
    }
    public boolean threeKeyState(){ 
        return threeKeyPressed; 
    }
    public boolean fourKeyState(){ 
        return fourKeyPressed; 
    }
    public boolean fiveKeyState(){ 
        return fiveKeyPressed; 
    }
    public boolean sixKeyState(){ 
        return sixKeyPressed; 
    }
    public boolean sevenKeyState(){ 
        return sevenKeyPressed; 
    }
    public boolean eightKeyState(){ 
        return eightKeyPressed; 
    }
    public boolean nineKeyState(){ 
        return nineKeyPressed; 
    }
    public boolean ZeroKeyState(){ 
        return zeroKeyPressed; 
    }
 }
