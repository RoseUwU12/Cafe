package OnlineServerStuff.PlayerStuff;

public class Friend { 
    private int[] friendListCheck = { 0 , 0 , 0 , 0 , 0};
    private String[] friendList = {" " , " " , " " , " " , " "};
    private String friendName;
    public Friend(){

    }
    public void addFriend( String n ){
    if (friendListCheck[0] == 0 ) { 
        friendListCheck[0] = 1; 
        friendList[0] = n;
    }
    else if (friendListCheck[1] == 0) { 
        friendListCheck[1] = 1; 
        friendList[1] = n;
    }
    else if (friendListCheck[2] == 0) { 
        friendListCheck[2] = 1;
        friendList[2] = n; 
    }
    else if (friendListCheck[3] == 0) {
        friendListCheck[3] = 1; 
        friendList[3] = n;
    }

    else if (friendListCheck[4] == 0) { 
        friendListCheck[4] = 1; 
        friendList[4] = n;
    }

    else if (friendListCheck[5] == 0) {
        friendListCheck[5] = 1; 
        friendList[5] = n;
    }
 }
 public void deleteFriend( int s) {
    if (friendListCheck[s] == 1) { 
        friendList[s] = " ";
        friendListCheck[s] = 0; 
    }
 }
 public void getFriendData( int x) { 
    friendName = friendList[x];
 }
 public String getFriend() { 
    return friendName;
 }
}
//! Code doesn't work effeciently 