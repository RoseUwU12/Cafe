package OnlineServerStuff.Connection;

public class Connect { 
    private double FPS; 
    private double ping; 
    private boolean isConencted; 
    private boolean disconnected; 
    private boolean error;
    
    public Connect() { 
        FPS = 0; 
        ping = 0; 
        isConencted = false; 
        disconnected = false;
        error = false;
    }
    public void joinServer() { 
        FPS = 60; 
        ping = 0; 
        isConencted = true; 
        if (FPS < 10 || ping > 20) { 
            isConencted = false; 
            disconnected = true; 
            error = true; 
        }
    }
}