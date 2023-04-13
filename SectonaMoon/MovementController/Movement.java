package MovementController;

import MovementController.Keyboard.ArrowKeys;

public class Movement { 
    Position P = new Position();
    ArrowKeys Aw = new ArrowKeys();
    private double Xpos; 
    private double speed; 
    private boolean isMovingLeft; 
    private boolean isMovingRight; 

    public Movement() { 
        Xpos = P.getXPos();
        speed = 3.0;
        isMovingLeft = false; 
        isMovingRight = false; 
    }
    public void moveLeft() { 
     for (;Aw.getLeftKeyState() == true;) { 
            Xpos = Xpos - speed; 
            isMovingLeft = true;
        }
        isMovingLeft = false; 
    }
    public void moveRight() { 
        for (;Aw.getRightKeyState() == true;) { 
            Xpos = Xpos + speed; 
            isMovingRight = true; 
        }
        isMovingLeft = false;
    }
    public boolean mIsMovingLeft() { 
        return isMovingLeft;
    }
    public boolean mIsMovingRight() { 
        return isMovingRight;
    }
}