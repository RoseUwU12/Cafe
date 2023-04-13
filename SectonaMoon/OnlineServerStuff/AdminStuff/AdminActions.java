package OnlineServerStuff.AdminStuff;
import OnlineServerStuff.PlayerStuff.Profile;
public class AdminActions { 
    Profile P = new Profile();

public class AdminActions {

    private boolean ban; 
    private boolean mute; 
    private boolean kick; 
    private double muteLength;
    private double banLength; 

    public AdminActions() { 
    ban = false; 
    mute = false; 
    kick = false; 
    muteLength = 0; 
    banLength = 0;
    }
    public void ban() { 
        ban = true; 
    }
    public void mute() { 
        mute = true; 
    }
    public void kick(){
        kick = true; 
    }
    public boolean getBan(){
        return ban; 
    }
    public boolean getMute() { 
        return mute; 
    }
    public boolean getKick() { 
        return kick;
    }
}