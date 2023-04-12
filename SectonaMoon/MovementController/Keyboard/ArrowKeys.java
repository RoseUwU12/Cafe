package MovementController.Keyboard;

public class ArrowKeys {
    private boolean upKeyPressed;
    private boolean downKeyPressed; 
    private boolean rightKeyPressed; 
    private boolean leftKeyPressed; 
    private boolean isReleased;

    public ArrowKeys() {
        upKeyPressed = false;
        downKeyPressed = false; 
        rightKeyPressed = false; 
        leftKeyPressed = false;
        isReleased = true; 
    }

    public void pressRightKey() { 
        upKeyPressed = true; 
    }
    public void pressLeftKey(){
        leftKeyPressed = true; 
    }
    public void pressUpKey(){
        upKeyPressed = true; 
    }
    public void pressDownKey() { 
        downKeyPressed = true; 
    }

    //Methods to call in other classes
    public boolean getUpKeyState() { 
        return upKeyPressed;
    }
    public boolean getDowneKeyState(){ 
        return downKeyPressed;
    }
    public boolean getRightKeyState(){
        return rightKeyPressed;
    }
    public boolean getLeftKeyState(){
        return leftKeyPressed;
    }
}
