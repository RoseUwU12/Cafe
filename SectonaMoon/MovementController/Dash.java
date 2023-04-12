package MovementController;
import PracticeProblems.ForLoop;
import MovementController.Keyboard.ArrowKeys;
import MovementController.Keyboard.SpecialKeys;

public class Dash {
    Movement M = new Movement();
    Position P = new Position();
    ArrowKeys Aw = new ArrowKeys();
    SpecialKeys Sk = new SpecialKeys();
    ForLoop Fl = new ForLoop();
    private int dashAmount; 
    private int dashLength; 
    private int dashRecharge;
    private int dashXpos;
    private boolean canDash; 

    public Dash() { 
        dashLength = 10; 
        dashRecharge = 5; 
        dashAmount = 1;
    }
    public void exDash( int x )  {
        if ( Aw.getLeftKeyState() == true && Sk.spaceKeyState() == true && canDash == true ) { 
            dashXpos = dashXpos - (dashLength * dashAmount);
            canDash = false;
            x = dashRecharge; 
            for (; x > dashRecharge ; x--) { 
            }
            canDash = true; 
        } 
        else if ( Aw.getRightKeyState() == true && Sk.spaceKeyState() == true && canDash == true ) { 
            dashXpos = dashXpos + (dashLength * dashAmount);
            canDash = false;
            x = dashRecharge; 
            for (; x > dashRecharge ; x--) { 
            }
            canDash = true; 
        }
    }
}
