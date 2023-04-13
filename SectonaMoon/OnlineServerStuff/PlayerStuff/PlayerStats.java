package OnlineServerStuff.PlayerStuff;
public class PlayerStats { 
    private String name;
    private int[] stats = { 0 , 0 , 0 , 0 , 0 , 0 , 0 };
    private int rank;
    private int wins; 
    private int losses;
    private int friends; 
    private int winrate;  
    private String status; 
    private int achievements;
    private int gamesPlayed; 
    private int tornamentWins;

    public PlayerStats() { 
        rank = 0; 
        wins = 0; 
        losses = 0;
        friends = 0; 
        status = "offline";
        achievements = 0; 
        gamesPlayed = 0; 
        tornamentWins = 0; 
    }
    public void getPlayerStats(String n , int r , int w , int l , int f , String s , int a , int g , int t){ 
        name = n; 
        rank = r; 
        wins = w; 
        losses = l; 
        friends = f; 
        status = s; 
        achievements = a; 
        gamesPlayed = g;
        tornamentWins = t;
        stats[0] = rank; 
        stats[1] = wins;
        stats[2] = losses;
        stats[3] = friends;
        stats[4] = achievements;
        stats[5] = gamesPlayed;
        stats[6] = tornamentWins;
    }
    public int getStats() { 
        return stats[0];
    }
    public int getStats1(){ 
        return stats[1];
    }
    public int getStats2() { 
        return stats[2];
    }
    public int getStats3(){ 
        return stats[3];
    }
    public int getStats4() { 
        return stats[4];
    }
    public int getStats5(){ 
        return stats[5];
    }
    public int getStats6() { 
        return stats[6];
    }
    public String getName() { 
        return name;
    }
    public String getStatus() { 
        return status;
    }
} 