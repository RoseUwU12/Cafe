package MovementController.Keyboard;

public class SpecialKeys {
    private boolean spaceKeyPressed; 
    private boolean enterKeyPressed; 
    private boolean shiftKeyPressed;

    public SpecialKeys() { 
        spaceKeyPressed = false; 
        shiftKeyPressed = false; 
        enterKeyPressed = false; 
    }
    public void pressSpecialKey( int s ){ 
        if ( s == 0 ) { 
            spaceKeyPressed = true;
        }
        else if ( s == 1) { 
            enterKeyPressed = true; 
        }
        else if ( s == 2 ) { 
            shiftKeyPressed = true; 
        }
    }
    
    public void resetSpecialKey() { 
        shiftKeyPressed = false; 
        spaceKeyPressed = false; 
        enterKeyPressed = false;
    }
    
    public boolean spaceKeyState() {
        return spaceKeyPressed;
    }
    public boolean shiftKeyState() { 
        return shiftKeyPressed;
    }
    public boolean enterKeyPressed(){ 
        return enterKeyPressed;
    }
}
