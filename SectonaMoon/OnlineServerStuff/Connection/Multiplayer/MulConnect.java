package OnlineServerStuff.Connection.Multiplayer;
import OnlineServerStuff.AdminStuff.AdminActions;
public class MulConnect {
    AdminActions Aa = new AdminActions(); 
    private boolean isBanned;
    private boolean voiceChatEnabled;
    private boolean hasBeenKicked;
    private boolean canConnect; 
    
    public MulConnect() { 
        if (Aa.getBan() == true) {
            isBanned = true; 
        }
        else {
            isBanned = false; 
        }
        if (Aa.getMute() == true) {
            voiceChatEnabled = false; 
        }
        else { 
            voiceChatEnabled = true; 
        }
        if (Aa.getKick() == true) { 
            hasBeenKicked = true; 
        }
        else { 
            hasBeenKicked = false; 
        }
        if (isBanned = true || voiceChatEnabled == false && hasBeenKicked == true)  {
            canConnect = false; 
        }
        else { 
            canConnect = true; 
        }
    }
    public boolean getConnection() { 
        return canConnect;
    }
    public boolean getVoiceChat(){
        return voiceChatEnabled;
    } 
    public boolean getKickStatus() { 
        return hasBeenKicked;
    }
    public boolean getBanStatus() {
        return isBanned;
    }
}