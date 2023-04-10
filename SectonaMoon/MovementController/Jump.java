package MovementController;

import MovementController.Keyboard.ArrowKeys;

public class Jump {
    ArrowKeys Ak = new ArrowKeys();
    Position P = new Position();
    public double jumpHieght; 
    public double gravity;
    public double YPos; 

    public Jump() { 
        jumpHieght = 10; 
        gravity = 0.25;
        YPos = P.getYPos();
    }
    public void jump() { 
        Ak.pressUpKey();
        if (Ak.getUpKeyState() == true ){ 
            YPos = jumpHieght + YPos; 
        }
        for (; YPos > 0;) { 
            YPos = YPos - gravity; 
        }
    }
    public double getYPos() { 
        return YPos;
    }
}
