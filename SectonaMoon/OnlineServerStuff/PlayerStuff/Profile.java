package OnlineServerStuff.PlayerStuff;
public class Profile { 
    Friend F = new Friend();
    PlayerStats Ps = new PlayerStats();
    private int[] playerStatistics = { 0 , 0 , 0 , 0 , 0 , 0 , 0};
    private String[] friends = { " " , " " , " " , " " , " "};
    private String Pname;
    private String Pstatus;

    public Profile() { 
        Pname = Ps.getName();
        Pstatus = Ps.getStatus();
        playerStatistics[0] = Ps.getStats();
        playerStatistics[1] = Ps.getStats1();
        playerStatistics[2] = Ps.getStats2();
        playerStatistics[3] = Ps.getStats3();
        playerStatistics[4] = Ps.getStats4();
        playerStatistics[5] = Ps.getStats5();
        playerStatistics[6] = Ps.getStats6();
        F.addFriend("rose");
        F.addFriend("korbin");
        F.addFriend("John");
        F.addFriend("Alex");
        F.addFriend("Shane");
        F.getFriendData( 0 );
        friends[0] = F.getFriend();
        F.getFriendData( 1 );
        friends[1] = F.getFriend();
        F.getFriendData( 2 );
        friends[2] = F.getFriend();
        F.getFriendData( 3 );
        friends[3] = F.getFriend();
        F.getFriendData( 4 );
        friends[4] = F.getFriend();
    }
    public String getPFriends(){
        return friends[0] + friends[1] + friends[2] + friends[3] + friends[4] ;
    }
    public String getPname(){ 
        return Pname;
    }
    public String getPstatus() { 
        return Pstatus;
    }
}